package com.saucedemo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class Validaciones extends PageObject {

public final By validateSesion = By.xpath("//span[text()='Products']");

    public By getValidateSesion() {
        return validateSesion;
    }

    public By getValidateCart() {
        return validateCart;
    }

    public final By validateCart = By.xpath("//h2[text()='Thank you for your order!']");
}
