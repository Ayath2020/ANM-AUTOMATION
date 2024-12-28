# language: es
Característica: Inicio de sesion exitoso ANM
  Como usuario OTTM de la página web de la Agencia Nacional de Minería,
  quiero iniciar sesión

  @Login
 Escenario: Login Exitoso
  Dado que el usuario ha ingresado a la página web de la ANM
  Cuando ingresa las credenciales de inicio de sesión correctamente y el OTP
    | email                  | password  |
    | bdsanchezc12@gmail.com | Test1234* |
  Entonces visualiza su nombre de perfil y las opciones del menu lateral