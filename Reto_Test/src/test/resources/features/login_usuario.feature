#Author: Andres

  @Stories

  Feature: Creacion de una nueva Business Unit en la pagina serenity
    Background:
      Given Yo estando en la pagina de StartSharp
      And especifico mis credenciales de logueo

  @scenario1
  Scenario: Registrar una nueva unidad de trabajo
    When ingreso al modulo Organizacion
    And creo la nueva unidad de negocio
    Then se completa la creacion de la nueva unidad de negocio "Save success"

    @scenario2
    Scenario: Registrar una nueva reunion
      When ingreso al modulo Meeting
      And creo la nueva reunion
      Then se completa la creacion de la nueva reunion "Save success"
