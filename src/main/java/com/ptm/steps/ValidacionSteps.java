package com.ptm.steps;

import com.ptm.pageObject.CompraAMineroSubsistenciaPage;
import com.ptm.pageObject.Validaciones;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ValidacionSteps {
    @Page
    Validaciones validacionesPage;
    @Page
    CompraAMineroSubsistenciaPage compraAMineroSubsistenciaPage;

    @Step("Validar titulo de inicio sesion")
    public void validacionSesion(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateSesion()
                ).isDisplayed()
        );

    }

    @Step("Validar que el mensaje de confirmación de la transacción sea visible y correcto")
    public void validarMensajeDeConfirmacion() {
        WebDriverWait wait = new WebDriverWait(compraAMineroSubsistenciaPage.getDriver(), Duration.ofSeconds(10));

        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(compraAMineroSubsistenciaPage.getMensajeConfirmacion()));

        String textoMensaje = mensaje.getText();

        String textoEsperado = "La transacción ha sido registrada de manera exitosa";

        if (textoMensaje.contains("ha sido registrada de manera exitosa")) {
            System.out.println("El mensaje contiene el texto esperado.");
        } else {
            throw new RuntimeException("El mensaje no contiene el texto esperado. Texto actual: " + textoMensaje);
        }
    }

    @Step("Validar que el mensaje de envio de OTP sea visible y correcto")
    public void validarMensajeDeEnvioOTP() {
        WebDriverWait wait = new WebDriverWait(compraAMineroSubsistenciaPage.getDriver(), Duration.ofSeconds(10));

        WebElement mensaje = wait.until(ExpectedConditions.visibilityOfElementLocated(compraAMineroSubsistenciaPage.getMensajeVerificacion()));

        String textoMensaje = mensaje.getText();

        String textoEsperado = "Se ha verificado de manera exitosa la transacción";

        if (textoMensaje.contains(textoEsperado)) {
            System.out.println("El mensaje contiene el texto esperado.");
        } else {
            throw new RuntimeException("El mensaje no contiene el texto esperado. Texto actual: " + textoMensaje);
        }
    }

}
