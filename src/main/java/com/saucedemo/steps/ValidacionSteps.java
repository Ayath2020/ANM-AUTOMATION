package com.saucedemo.steps;

import com.saucedemo.pageObject.Validaciones;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.junit.Assert;

public class ValidacionSteps {
    @Page
    Validaciones validacionesPage;

    @Step("Validar titulo de inicio sesion")
    public void validacionSesion(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateSesion()
                ).isDisplayed()
        );

    }

    @Step("Validaar compra exitosa")
    public void validacionCarrito(){
        Assert.assertTrue(
                validacionesPage.getDriver().findElement(
                        validacionesPage.getValidateCart()
                ).isDisplayed()
        );
    }

}
