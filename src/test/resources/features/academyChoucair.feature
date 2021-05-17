#Autor: lizeth lopez

  @stories
  Feature: Academy Choucair
    As a user,I want to learn how to automate in screamplay at the Choucair Academy with the automation course
  @scenario1
  Scenario: Search for a automation course
    Given than andrea wants to learn automation at the academy Choucair
    | StrUser   | StrPassword |
    | TuUsuario |   TuClave   |
    When he search for the course  on the choucair academy platform
    | StrCourse               |
    | Metodologìa Bancolombia |
    Then she finds the course called
    | strCousrse |
    | Metodologìa Bancolombia |


