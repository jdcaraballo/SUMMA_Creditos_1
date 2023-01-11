
Feature: Login from Dir Act
  Yo como usuario
  quiero iniciar sesion en el portal creditos
  para navegar en la pantalla del modulo de creditos

  Scenario: Login from Dir Act
    Given que el abre pagina principal
    When el inicia sesion desde el DA con usuario upruebas2@summa-sci.com con clave David-2820*
    Then se vera pantalla de inicio del gestor senior