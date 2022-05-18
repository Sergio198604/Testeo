Feature: Categoria comics
  Como ususario quiero leer chistes de testers para reirme y pasar un buen rato.

  Scenario: Ingresar a la categoria comics desde la pantalla Home
    Given El usuario se encuentra en la página Home de iamalittletester
    When Hace click sobre el botón  The little tester comics
    Then Se debe redirigir a la pantalla Comics


