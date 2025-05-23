# Explicação de Actions e Workflows

No workflow, temos uma sequência de passos que o Github Actions vai executar em contêiner isolado, podendo ser feito uma sequência de jobs e steps para fazer diversos tipos de atividade, como checkout, deploy, build, test e muitos outros, o workflow pode ser chamado através de diversos tipos de evento.

Já o actions, embora também possua uma sequência de passos a ser executado, ela possui como principal diferença o fato de ser um componente reutilizável, podendo ser utilizado em múltiplos workflows.

Um exemplo de actions utilizado é o actions/setup-java@v4, no qual é utilizado para instalar as dependências do java e maven no job específico, sendo chamada através do uses e os parâmetros passados através do with.
