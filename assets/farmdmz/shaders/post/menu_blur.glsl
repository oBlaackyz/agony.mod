//LUNAR-SHADER-DEFINITION-MARKER

// One direction of a separable Gaussian. Each pair of neighbouring taps is merged into a single bilinear
// fetch placed between them by weight, so the input must be sampled with linear filtering.
void main() {
    vec2 texelStep = OneTexel * BlurDir;

    // Incremental Gaussian: g(x) = exp(-x^2 / (2 sigma^2)), g(x + 1) = g(x) * ratio, ratio *= ratioStep.
    float ratioStep = exp(-1.0 / (Sigma * Sigma));
    float ratio = sqrt(ratioStep);
    float weight = 1.0;

    vec4 center = SAMPLE(DiffuseSampler, uv);
    vec3 blurred = center.rgb;
    float totalWeight = 1.0;
    // Summed rather than averaged to match the alpha the previous box blur wrote.
    float totalAlpha = center.a;

    for (float x = 1.0; x <= Radius; x += 2.0) {
        weight *= ratio;
        ratio *= ratioStep;
        float nearWeight = weight;
        weight *= ratio;
        ratio *= ratioStep;
        float pairWeight = nearWeight + weight;
        // Sub-pixel sigmas underflow ratioStep to zero; a zero pair would make the offset NaN.
        if (pairWeight <= 0.0) {
            break;
        }

        vec2 offset = texelStep * (x + weight / pairWeight);
        vec4 positive = SAMPLE(DiffuseSampler, uv + offset);
        vec4 negative = SAMPLE(DiffuseSampler, uv - offset);

        blurred += (positive.rgb + negative.rgb) * pairWeight;
        totalWeight += 2.0 * pairWeight;
        totalAlpha += 2.0 * (positive.a + negative.a);
    }

    OUT_COLOR = vec4(blurred / totalWeight, totalAlpha);
}
