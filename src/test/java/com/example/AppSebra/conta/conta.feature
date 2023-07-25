Feature: CRUD de conta
  Funcionalidade responsável pelos CRUD de contas.

  Scenario:
    Given Aplicacao recebeu nome e descricao de conta;
    When Aplicacao salva
    Then Aplicacao mostra objeto não nulo e com ID esperado
