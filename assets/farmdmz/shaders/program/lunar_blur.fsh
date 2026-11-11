#version 150

uniform sampler2D DiffuseSampler;
in vec2 texCoord;
in vec2 oneTexel;
uniform vec2 BlurDir;
uniform float Radius;
uniform float Sigma;
out vec4 fragColor;

void main() {
    vec2 texelStep = oneTexel * BlurDir;
    float ratioStep = exp(-1.0 / (Sigma * Sigma));
    float ratio = sqrt(ratioStep);
    float weight = 1.0;
    vec4 center = texture(DiffuseSampler, texCoord);
    vec3 blurred = center.rgb;
    float totalWeight = 1.0;
    float totalAlpha = center.a;
    for (float x = 1.0; x <= Radius; x += 2.0) {
        weight *= ratio;
        ratio *= ratioStep;
        float nearWeight = weight;
        weight *= ratio;
        ratio *= ratioStep;
        float pairWeight = nearWeight + weight;
        if (pairWeight <= 0.0) break;
        vec2 offset = texelStep * (x + weight / pairWeight);
        vec4 positive = texture(DiffuseSampler, texCoord + offset);
        vec4 negative = texture(DiffuseSampler, texCoord - offset);
        blurred += (positive.rgb + negative.rgb) * pairWeight;
        totalWeight += 2.0 * pairWeight;
        totalAlpha += 2.0 * (positive.a + negative.a);
    }
    fragColor = vec4(blurred / totalWeight, totalAlpha);
}
