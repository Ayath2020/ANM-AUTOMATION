package com.saucedemo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class InicioSesionPage extends PageObject {

    private final By txtUsername = By.id("user-name");
    private final By txtPassw = By.id("password");
    private final By btnLogin = By.id("login-button");

    public By getTxtUsername() {
        return txtUsername;
    }

    public By getTxtPassw() {
        return txtPassw;
    }

    public By getBtnLogin() {
        return btnLogin;
    }
}
