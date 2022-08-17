#language: en
Feature:  Gestion de alojamientos

  @AlojamientoUnaPersona
  Scenario Outline: consulta de alojamiento para 1 persona

      Given Santiago ingresa a booking para consultar el  alojamiento
      When  ingresar en el filtro de busqueda los datos requeridos <row>
      | ExcelRoute                               | sheet  |
      | src/test/resources/datadriven/datos.xlsx | inicio |
      Then  Debera ver el listado de alojamientos disponibles para 'una' persona
      Examples:
      | row |
      |1    |

  @AlojamientoDosPersona
  Scenario Outline: consulta de alojamiento para 2 personaS

    Given Santiago ingresa a booking para consultar el  alojamiento
    When  ingresar al filtro de busqueda los datos requeridos <row>
      | ExcelRoute                               | sheet  |
      | src/test/resources/datadriven/datos.xlsx | inicio |
    Then  se visualizara el listado de alojamientos disponibles para 'dos' personas
    Examples:
      | row |
      |1    |


  @AlojamientoFamiliar
  Scenario Outline: consulta de alojamiento familiar

    Given Santiago ingresa a booking para consultar el  alojamiento
    When  ingresar al filtro de busqueda los datos requeridos <row> familiar
      | ExcelRoute                               | sheet  |
      | src/test/resources/datadriven/datos.xlsx | inicio |
    Then  se visualizaran los alojamientos disponibles  'una' familia
    Examples:
      | row |
      |1    |