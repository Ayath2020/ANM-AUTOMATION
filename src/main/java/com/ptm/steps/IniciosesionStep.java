package com.ptm.steps;

import com.ptm.pageObject.InicioSesionPage;
import com.ptm.utils.DatabaseUtils;
import com.ptm.utils.Dictionary;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class IniciosesionStep {


    @Page
    private InicioSesionPage sesionPage;

    @Step("Abrir navegor")
    public void open(){
        sesionPage.openUrl(Dictionary.getUrlCal());
    }
    @Step("Ingresar credenciales")

    public void enterCredentials(DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String email = data.get(0).get("email");
        String password = data.get(0).get("password");

        WebDriverWait wait = new WebDriverWait(sesionPage.getDriver(), Duration.ofSeconds(10));

        sesionPage.getDriver().findElement(sesionPage.getTxtUsername()).sendKeys(email);
        sesionPage.getDriver().findElement(sesionPage.getTxtPassw()).sendKeys(password);
        sesionPage.getDriver().findElement(sesionPage.getBtnLogin()).click();

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(sesionPage.getTxtCode()));
            WebElement codeInput = wait.until(ExpectedConditions.elementToBeClickable(sesionPage.getTxtCode()));

            String authCode = DatabaseUtils.getAuthenticationCode(email);
            if (authCode == null) {
                throw new RuntimeException("No se pudo obtener el código de autenticación para el email: " + email);
            }

            codeInput.clear();
            codeInput.sendKeys(authCode);

        } catch (TimeoutException e) {
            throw new RuntimeException("No se pudo encontrar o interactuar con el campo del código", e);
        }
        sesionPage.getDriver().findElement(sesionPage.getBtnAceptar()).click();
    }
}
