package com.ptm.stepDefinitions;

import com.ptm.steps.CompraAMineroSubsistenciaStep;
import com.ptm.steps.IniciosesionStep;
import com.ptm.steps.ValidacionSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {

    @Steps
    IniciosesionStep iniciosesionStep;
    @Steps
    ValidacionSteps validacionSteps;


    @Dado("que el usuario ha ingresado a la página web de la ANM")
    public void queElUsuarioHaIngresadoALaPáginaWebdelaANM()   {
        iniciosesionStep.open();
    }
    @Cuando("ingresa las credenciales de inicio de sesión correctamente y el OTP")
    public void ingresaLasCredencialesDeInicioDeSesiónCorrectamenteYelOTP(DataTable dataTable) throws InterruptedException {
        iniciosesionStep.enterCredentials(dataTable);
    }

    @Entonces("visualiza su nombre de perfil y las opciones del menu lateral")
    public void visualizaSuNombreDePerfilYLasOpcionesDelMenuLateral() {
        validacionSteps.validacionSesion();
    }



}
