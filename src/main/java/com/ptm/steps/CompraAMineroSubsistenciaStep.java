package com.ptm.steps;

import com.ptm.pageObject.CompraAMineroSubsistenciaPage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;

public class CompraAMineroSubsistencia {

    @Page
    CompraAMineroSubsistenciaPage compraAMineroSubsistenciaPage;


    @Step("ottm_temporary_storage_b1")
    public void fill_ottm_temporary_storage_b1(){
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getComprasBtn()).click();
    }


}
