    package com.ptm.steps;

    import com.ptm.pageObject.CompraAMineroSubsistenciaPage;
    import com.ptm.utils.DatabaseUtils;
    import net.thucydides.core.annotations.Step;
    import org.fluentlenium.core.annotation.Page;
    import org.openqa.selenium.JavascriptExecutor;
    import org.openqa.selenium.TimeoutException;
    import org.openqa.selenium.WebElement;
    import org.openqa.selenium.support.ui.ExpectedConditions;
    import org.openqa.selenium.support.ui.WebDriverWait;

    import java.time.Duration;

    public class ConfirmarCompraMineroSubsistenciaSteps {
        @Page
        CompraAMineroSubsistenciaPage compraAMineroSubsistenciaPage;

        @Step("guardarTransacción")
        public void authenticatedseller() {

            compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getGuardarTxBtn()).click();

        }

        @Step("Ingresar OTP")
        public void ingresarOTP(){
            WebDriverWait wait = new WebDriverWait(compraAMineroSubsistenciaPage.getDriver(), Duration.ofSeconds(10));
            try {
                wait.until(ExpectedConditions.visibilityOfElementLocated(compraAMineroSubsistenciaPage.getCerrarBtn()));
                WebElement codeInput = wait.until(ExpectedConditions.elementToBeClickable(compraAMineroSubsistenciaPage.getCerrarBtn()));
                compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getCerrarBtn()).click();

                String miningactorid = "48333";

                String authCode = DatabaseUtils.getVerificationTXCode(miningactorid);

                compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getCodeTxtBtn()).sendKeys(authCode);
            } catch (
                    TimeoutException e) {
                throw new RuntimeException("No se pudo encontrar o interactuar con el campo del mining actor id", e);
            }
        }

        @Step ("Confirmar Transaccion")
        public void confirmarTransaccion(){
            compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getConfirmarTxBtn()).click();
        }
    }
