
Feature: iniciar sesion
  como usuario superviar debo inicar sesion en
Scenario: iniciar sesion con credenciales validas
Given Usuario se encuentra en "https://www.saucedemo.com/"
When ingreso usuario "standard_user"
And ingreso password "secret_sauce"
And preciono boton "aceptar"
Then debera mostrar la pagina principal
And Inicio de sesion exitoso

  Scenario: iniciar sesion con credenciales validas
    Given Usuario se encuentra en "https://www.saucedemo.com/"
    When ingreso usuario "standard_user"
    And ingreso password "secret_sauce"
    And preciono boton "aceptar"
    Then debera mostrar la pagina principal
    And Inicio de sesion exitoso