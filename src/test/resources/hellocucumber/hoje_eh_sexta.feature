Feature: Hoje é sexta feira
  Todos querem saber se hoje é sexta

  Scenario Outline: Verifica se é sexta
    Given hoje é "<dia>"
    When verifica se é sexta
    Then resposta é "<resposta>"

  Examples:
    | dia | resposta |
    | sexta | sim |
    | terça | não |
    | sábado | não |