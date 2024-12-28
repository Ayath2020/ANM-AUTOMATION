package com.ptm.steps;

import com.ptm.Models.SellerModel;
import com.ptm.pageObject.CompraAMineroSubsistenciaPage;
import io.cucumber.datatable.DataTable;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;

public class CompraAMineroSubsistenciaStep {

    @Page
    CompraAMineroSubsistenciaPage compraAMineroSubsistenciaPage;

    @Step("ottm_temporary_storage_b1")
    public void fill_ottm_temporary_storage_b1(DataTable dataTable) throws InterruptedException{

        List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
        String numeroDocumentoSeller = data.get(0).get("numeroDocumentoSeller");
        String firstName = data.get(0).get("firstName");
        String firstLastName = data.get(0).get("firstLastName");
        String secondLastName = data.get(0).get("secondLastName");
        SellerModel seller = new SellerModel(numeroDocumentoSeller,firstName,firstLastName,secondLastName);


        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getComprasBtn()).click();
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getMineroSubBtn()).click();
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getSellerDocumentNumberTxt()).sendKeys(seller.getNumeroDocumento());
        WebElement dropdown = compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getDocumentTypeDropdown());
        Select select = new Select(dropdown);
        select.selectByVisibleText("Cédula de ciudadanía");
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getLblsellerFirstName()).sendKeys(seller.getFirstName());
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getSellerFirstLastname()).sendKeys(seller.getFirstLastName());
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getSellerSecondLastname()).sendKeys(seller.getSecondLastName());
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getSiguienteBtn()).click();


    }

    @Step ("ottm_temporary_storage_b2")
    public void fill_ottm_temporary_storage_b2() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String fechaFormateada = fechaActual.format(formato);

        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getFechaFacturabtn()).sendKeys(fechaFormateada);
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getShaBtn()).sendKeys("0");

        WebElement moneyDropdown = compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getMoneyDropdown());
        Select moneySelect = new Select(moneyDropdown);
        moneySelect.selectByVisibleText("COP");

        WebElement departmentDropdown = compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getDepartmentDropdown());
        Select departmentSelect = new Select(departmentDropdown);
        departmentSelect.selectByVisibleText("META");

        WebElement cityDropdown = compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getCityDropdown());
        Select citySelect = new Select(cityDropdown);
        citySelect.selectByVisibleText("ACACÍAS");

        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getSiguienteBtn()).click();

        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getPlusBtn()).click();
        WebElement mineralDropdown = compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getMineralTxt());
        Select mineralSelect = new Select(mineralDropdown);
        mineralSelect.selectByVisibleText("Oro - AU");
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getCantidadTxt()).sendKeys("0.0001");
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getPrecioTxt()).sendKeys("10");
    }

    @Step ("ottm_assemble_json")
    public void ottm_assemble_json() {

        WebElement elemento = compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getGuardarTxBtn());

        JavascriptExecutor js = (JavascriptExecutor) compraAMineroSubsistenciaPage.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);", elemento);
        compraAMineroSubsistenciaPage.getDriver().findElement(compraAMineroSubsistenciaPage.getGuardarTxBtn()).click();
    }
}
