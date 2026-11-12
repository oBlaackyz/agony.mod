# Agony — Forge 1.20.2 (v0.4.1)

Mod de cliente. INSERT abre o painel. Auto Trigo e Auto Peixe implementados (não testados no jogo).

## Compilar (Windows 10, Java 17)
1. Baixe o MDK oficial 1.20.2-48.1.0 (files.minecraftforge.net) e copie `gradlew`, `gradlew.bat` e a pasta `gradle/` para a raiz.
2. `gradlew build` -> `build/libs/agony-0.2.0.jar`   (teste direto: `gradlew runClient`)

## Instalar
Copie o JAR para `%appdata%\.minecraft\mods`.

## Arquivos salvos
- `config/agony-client.toml`: esperas, tempo de crescimento, opções (restaurado ao reiniciar).
- `config/agony-state.json`: hora de término da contagem (relógio do Windows) e se o trigo estava ligado.

## Sonda de pesca (diagnóstico)
No painel, botão SONDA no cartão Auto Peixe: grava no log (`[AGONY][sonda]`) action bar, título, subtítulo, boss bars, tela aberta e chat enquanto você pesca manualmente. Envie esse trecho do `logs/latest.log`.

## Auto Trigo
`/ilhafarm` -> confirma chegada ("Teleportado para o local 'ilhafarm'") -> `/canteiro 1..4`, cada um com UM clique
no botão "COLHER" da tela -> contagem de 30 min reais -> repete.
"Teleporte cancelado" (qualquer teleporte) é detectado no chat; se ocorrer durante o `/ilhafarm` da automação,
ele é reenviado automaticamente (limite configurável).

## Se o clique no botão não funcionar
Abra o jogo, ligue o Auto Trigo e envie o trecho `[AGONY][diag]` de `logs/latest.log`.

## Auto Peixe
`/home peixe` -> chegada confirmada -> lança a vara -> atrai (cliques espaçados) -> arco (clica só com o ponteiro
na zona) -> círculo (clica só quando fecha) -> confirma -> espera -> repete.
Lê o estado real do minigame pelo mod de pesca do servidor (WarriorsExtra, protocolo 2). Se esse mod não existir
ou mudar, o botão informa o motivo e nada é enviado às cegas.
Se Auto Trigo e Auto Peixe estiverem ligados juntos, o Trigo tem prioridade: a pesca cede a vez durante o ciclo
da fazenda e retoma (`/home peixe`) quando ele volta a aguardar o crescimento.
Ajustes finos em `config/agony-client.toml` (seção `peixe`).

## Trigo: o que o log mostrou
A tela é `TelaColheita` (sem widgets); os botões ficam na lista `hits` e o servidor confirma pelo aviso
"Você colheu 30 trigo." / "Plantado no canteiro N. Pronto em 30:00.". O mod clica no botão principal e só avança
com o aviso "Plantado" (ou se o servidor recusar). Se `config/agony-client.toml` já existe, apague-o (ou ajuste
`harvestScreenClassContains = "TelaColheita"`, `maxClickAttempts = 3`, `afterClickDelaySeconds = 1.5`).

## Já na fazenda / timer
- O local da fazenda é aprendido ao chegar (`/ilhafarm`) ou quando a tela de um canteiro abre, e fica salvo
  em `config/agony-state.json`. Também dá para marcar à mão no painel (MARCAR LOCAL). Perto dele (raio
  `farmRadiusBlocks`, padrão 60) o mod NÃO teleporta: vai direto aos canteiros.
- `/ilhafarm` só é enviado com você parado (`recoverStillSeconds`). Cancelamento não desliga: espera você parar e tenta de novo.
- Falhas seguidas entram em espera (`farmBackoffSeconds`) e tentam de novo, então o ciclo seguinte sempre acontece.
- Timer zerado: novo ciclo sozinho (teleporta se estiver fora da fazenda, colhe e planta de novo).
- Antes de clicar, confere a hora de término do canteiro informada pelo servidor.
