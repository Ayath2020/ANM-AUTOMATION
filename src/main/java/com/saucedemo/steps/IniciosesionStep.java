package com.saucedemo.steps;

import com.saucedemo.pageObject.InicioSesionPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class IniciosesionStep {

    @Page
    private InicioSesionPage sesionPage;

    @Step("Abrir navegor")
    public void open(){
        sesionPage.openUrl("https://www.saucedemo.com/");
    }
    @Step("Ingresar credenciales")
    public void enterCredentials(){
        sesionPage.getDriver().findElement(sesionPage.getTxtUsername()).sendKeys("standard_user");
        sesionPage.getDriver().findElement(sesionPage.getTxtPassw()).sendKeys("secret_sauce");
        sesionPage.getDriver().findElement(sesionPage.getBtnLogin()).click();
    }
}
