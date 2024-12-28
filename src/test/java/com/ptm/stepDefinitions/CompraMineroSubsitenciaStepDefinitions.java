package com.ptm.stepDefinitions;

import com.ptm.steps.CompraAMineroSubsistenciaStep;
import com.ptm.steps.IniciosesionStep;
import com.ptm.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Steps;

import javax.xml.crypto.Data;

public class ComprarArticuloStepDefinitions {
    @Steps
    IniciosesionStep iniciosesionStep;
    @Steps
    ValidacionSteps validacionSteps;
    @Steps
    CompraAMineroSubsistenciaStep compraAMineroSubsistenciaStep;

    @Dado("que el usuario ingrese a la pagina web")
    public void queElUsuarioIngreseALaPaginaWeb() {
        iniciosesionStep.open();
    }

    @Cuando("ingrese las credenciales de inicio de sesion correctamente")
    public void ingreseLasCredencialesDeInicioDeSesionCorrectamente(DataTable dataTable) throws InterruptedException {
        iniciosesionStep.enterCredentials(dataTable);
        validacionSteps.validacionSesion();
    }

    @Cuando("diligencie los campos obligatorios del primer formulario con los datos del vendedor")
    public void diligencieLosCamposObligatoriosDelPrimeroFormularioConLosDatosDelVendedor(DataTable dataTable) throws InterruptedException{
        compraAMineroSubsistenciaStep.fill_ottm_temporary_storage_b1(dataTable);
    }
    @Cuando("se habilite la opcion de guardar transaccion")
    public void seHabiliteLaOpcionDeGuardarTransaccion() {

    }
    @Cuando("Se presente el mensaje confirmando la transaccion exitosa y el envio del OTP")
    public void sePresenteElMensajeConfirmandoLaTransaccionExitosaYElEnvioDelOTP() {

    }
    @Cuando("se consulte el OTP en BD para ingresarlo y confirmar la transacción")
    public void seConsulteElOTPEnBDParaIngresarloYConfirmarLaTransacción() {

    }
    @Entonces("Se debe presentar el mensaje confirmando que se finalizo exitosamente la venta")
    public void seDebePresentarElMensajeConfirmandoQueSeFinalizoExitosamenteLaVenta() {

    }
}