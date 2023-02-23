

Feature: Contato
 	Como usuario Quero acessar o site Para entrar em contato
 	
	@contato
  Scenario: Preenchimento do contato
    Given eu acessar o site
    And clicar em contato
    When preencho os dados
    And clicar no checkbox
    Then envio o fomulario

  
