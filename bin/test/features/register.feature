#language: en
Feature:  Registro de usuarios en  pagina web

  Scenario Outline: Realizar  registro de nuevo usuario

    Given Santiago esta en la plataforma para registrarse
    When ingresar en el modulo  de registro <row>
      | ExcelRoute                               | sheet  |
      | src/test/resources/datadriven/datos.xlsx | inicio |

    Then Debera ver el mensaje 'Welcome to the world's largest community of freelance software testers!'
    Examples:
      | row |
      |1    |


