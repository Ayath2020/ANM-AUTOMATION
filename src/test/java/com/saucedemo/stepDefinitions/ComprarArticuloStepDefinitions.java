package com.saucedemo.stepDefinitions;

import com.saucedemo.pageObject.Validaciones;
import com.saucedemo.steps.ComprarArticuloSteps;
import com.saucedemo.steps.IniciosesionStep;
import com.saucedemo.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

public class ComprarArticuloStepDefinitions {

    @Steps
    IniciosesionStep iniciosesionStep;
    @Steps
    ValidacionSteps validacionSteps;

    @Steps
    ComprarArticuloSteps comprarArticuloSteps;


    @Dado("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        iniciosesionStep.open();
    }

    @Cuando("ingrese las credenciales de inicio de sesion correctamente")
    public void ingreseLasCredencialesDeInicioDeSesionCorrectamente() {
        iniciosesionStep.enterCredentials();
        validacionSteps.validacionSesion();
    }

    @Entonces("podra comprar un articulo y finalizar la compra correctamente")
    public void podraComprarUnArticuloYFinalizarLaCompraCorrectamente() {
    comprarArticuloSteps.agregarArticulo();
    comprarArticuloSteps.comprarArticulo();
    validacionSteps.validacionCarrito();
    }
}
