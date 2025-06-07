---
title: Workflow falho {{ date | date('dddd, MMMM Do') }}
labels: bug
---
## Workflow falhou

Um workflow falhou, o que levou a geração desse
issue em específico.

### CI falho
- Workflow: {{ github.workflow }}
- Job: {{ github.job }}
- Commit: {{ github.sha }}

Observe o log do workflow em questão para descobrir
a causa do problema.