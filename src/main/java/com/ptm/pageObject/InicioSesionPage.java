package com.ptm.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    private final By txtUsername = By.id("userEmail");
    private final By txtPassw = By.id("userPassword");
    private final By btnLogin = By.xpath("//button[contains(text(), 'Iniciar sesión') and contains(@class, 'bg-green-700')]\n");
    private final By txtCode = By.id("code");
    private final By btnAceptar = By.xpath("//button[contains(text(), ' Aceptar') and contains(@class, 'bg-green-700')]\n");

    public By getTxtUsername() {return txtUsername;}

    public By getTxtPassw() {
        return txtPassw;
    }

    public By getBtnLogin() {
        return btnLogin;
    }

    public By getTxtCode() {
        return txtCode;
    }

    public By getBtnAceptar() {
        return btnAceptar;
    }
}
