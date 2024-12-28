# language: es
Característica: Compra a minero de subsistencia
  Como usuario OTTM de la página web de la Agencia Nacional de Minería,
  quiero iniciar sesión y realizar la compra de minerales a un minero de subsistencia,
  para garantizar el cumplimiento del proceso.

  Antecedentes:
    Dado que el usuario ha ingresado a la página web de la ANM
    Y ha ingresado las credenciales de inicio de sesión correctamente
      | email                     | password  |
      | bdsanchezc12@gmail.com    | Test1234* |

  Escenario: Diligenciar datos del vendedor y enviar OTP
    Dado que el usuario accede al formulario de compra a minero de subsistencia
    Cuando diligencie los campos obligatorios con los datos del vendedor
      | numeroDocumentoSeller | firstName | firstLastName | secondLastName |
      | 1216727683            | Prueba    | Automatizada  | ANM            |
    Entonces se debe habilitar la opción de guardar transacción
    Y se debe mostrar un mensaje confirmando el envío del OTP

  Escenario: Confirmar transacción con OTP
    Dado que el usuario ha recibido el OTP
    Cuando ingrese el OTP en el campo correspondiente
    Entonces se debe confirmar la transacción
    Y se debe mostrar un mensaje indicando que la venta se finalizó exitosamente
