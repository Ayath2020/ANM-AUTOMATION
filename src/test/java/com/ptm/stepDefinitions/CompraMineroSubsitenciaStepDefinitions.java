package com.ptm.stepDefinitions;

import com.ptm.steps.CompraAMineroSubsistenciaStep;
import com.ptm.steps.ConfirmarCompraMineroSubsistenciaSteps;
import com.ptm.steps.IniciosesionStep;
import com.ptm.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Steps;


public class CompraMineroSubsitenciaStepDefinitions {
    @Steps
    IniciosesionStep iniciosesionStep;
    @Steps
    ValidacionSteps validacionSteps;
    @Steps
    CompraAMineroSubsistenciaStep compraAMineroSubsistenciaStep;

    @Steps
    ConfirmarCompraMineroSubsistenciaSteps confirmarCompraMineroSubsistenciaSteps;

    @Dado("que el usuario ha iniciado sesion exitosamente")
    public void queElUsuarioHaIniciadoSesionExitosamente(DataTable dataTable) throws InterruptedException{
        iniciosesionStep.open();
        iniciosesionStep.enterCredentials(dataTable);
    }

    @Cuando("accede al formulario de compra y diligencia los campos obligatorios")
    public void accedeAlFormularioDeCompraYDiligenciaLosCamposObligatorios(DataTable dataTable) throws InterruptedException {
        compraAMineroSubsistenciaStep.fill_ottm_temporary_storage_b1(dataTable);
        compraAMineroSubsistenciaStep.fill_ottm_temporary_storage_b2();

    }

    @Entonces("se debe habilitar la opción de guardar transacción")
    public void seDebeHabilitarLaOpciónDeGuardarTransacción() {
        confirmarCompraMineroSubsistenciaSteps.authenticatedseller();

    }
    @Entonces("se debe mostrar un mensaje confirmando el envío del OTP")
    public void seDebeMostrarUnMensajeConfirmandoElEnvíoDelOTP() {
        validacionSteps.validarMensajeDeEnvioOTP();
    }

    @Cuando("ingrese el OTP en el campo correspondiente  se debe confirmar la transacción")
    public void ingreseElOTPEnElCampoCorrespondienteSeDebeConfirmarLaTransacción() {
        confirmarCompraMineroSubsistenciaSteps.ingresarOTP();
        confirmarCompraMineroSubsistenciaSteps.confirmarTransaccion();
    }

    @Entonces("se debe mostrar un mensaje indicando que la venta se finalizó exitosamente")
    public void seDebeMostrarUnMensajeIndicandoQueLaVentaSeFinalizóExitosamente() {
            validacionSteps.validarMensajeDeConfirmacion();
    }




}

