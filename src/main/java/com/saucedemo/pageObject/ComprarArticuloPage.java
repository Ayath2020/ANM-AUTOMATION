package com.saucedemo.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class ComprarArticuloPage extends PageObject {

    private final By btnAddCart = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private final By btnGoCart = By.className("shopping_cart_link");
    private final By btnChekout = By.id("checkout");
    private final By txtName = By.id("first-name");
    private final By txtLastName = By.id("last-name");

    public By getBtnAddCart() {
        return btnAddCart;
    }

    public By getBtnGoCart() {
        return btnGoCart;
    }

    public By getBtnChekout() {
        return btnChekout;
    }

    public By getTxtName() {
        return txtName;
    }

    public By getTxtLastName() {
        return txtLastName;
    }

    public By getTxtCodePostal() {
        return txtCodePostal;
    }

    public By getBtnContinue() {
        return btnContinue;
    }

    public By getBtnFinish() {
        return btnFinish;
    }

    private final By txtCodePostal = By.id("postal-code");
    private final By btnContinue = By.id("continue");
    private final By btnFinish = By.id("finish");






}
