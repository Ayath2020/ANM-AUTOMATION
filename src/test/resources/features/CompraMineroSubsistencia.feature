# language: es

Característica: Compra a minero de subsistencia
  Como usuario OTTM de la página web de la Agencia Nacional de Minería,
  quiero iniciar sesión y realizar la compra de minerales a un minero de subsistencia,
  para garantizar el cumplimiento del proceso.

  @ottm_assemble_json
  Escenario: Diligenciar formulario y confirmar transaccion
    Dado que el usuario ha iniciado sesion exitosamente
      | email                  | password  |
      | bdsanchezc12@gmail.com | Test1234* |
    Cuando accede al formulario de compra y diligencia los campos obligatorios
      | numeroDocumentoSeller | firstName | firstLastName | secondLastName |
      | 1216727683            | Prueba    | Automatizada  | ANM            |
    Entonces se debe habilitar la opción de guardar transacción
    Y se debe mostrar un mensaje confirmando el envío del OTP
    Cuando ingrese el OTP en el campo correspondiente  se debe confirmar la transacción
    Entonces se debe mostrar un mensaje indicando que la venta se finalizó exitosamente