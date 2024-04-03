package com.saucedemo.steps;

import com.saucedemo.pageObject.ComprarArticuloPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class ComprarArticuloSteps {

    @Page
    ComprarArticuloPage comprarArticuloPage;


    @Step("Seleccionar Articulo")
    public void agregarArticulo(){
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getBtnAddCart())
                .click();
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getBtnGoCart())
                .click();
    }


    @Step("Comprar Articulo seleccionado")
    public void comprarArticulo(){
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getBtnChekout()).click();
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getTxtName())
                .sendKeys("Parco");
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getTxtLastName())
                .sendKeys("QA");
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getTxtCodePostal())
                .sendKeys("050001");
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getBtnContinue()).click();
        comprarArticuloPage.getDriver().findElement(comprarArticuloPage.getBtnFinish()).click();
    }
}
