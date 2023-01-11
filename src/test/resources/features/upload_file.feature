
Feature: Upload File
  Yo como Gestor Senior
  quiero cargar plantilla excel
  para ver reflejado en el aplicativo

  Background: Inicio Sesión como Gestor Senior
    Given que el Gestor Senior de Creditos inicia sesion con usuario upruebas2@summa-sci.com con clave David-2820*

  Scenario: Cargar plantilla excel
    When el carga ela plantilla al aplicativo
    Then se veran los beneficios por Conpania en pantalla