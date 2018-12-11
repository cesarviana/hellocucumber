Feature: Operações básicas de uma calculadora
  Uma calculadora deve fazer soma, divisão e subtração

  Scenario Outline: Soma de dois números
    Given primeiro numero é <primeiro> e segundo numero é <segundo>
    When calcula soma
    Then o resultado deve ser <resultado>

  Examples:
    | primeiro | segundo | resultado |
    | 1 | 2 | 3 |
    | 3 | 3 | 6 |
    | 2 | 6 | 8 |
    | -1 | 2 | 1 |
    | 0 | 0 | 0 |