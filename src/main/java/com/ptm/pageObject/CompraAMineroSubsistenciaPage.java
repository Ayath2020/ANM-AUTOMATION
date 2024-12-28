package com.ptm.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class CompraAMineroSubsistenciaPage extends PageObject {

    private final By ComprasBtn = By.xpath("//span[text()='Compras']\n");

    private final By MineroSubBtn = By.xpath("//a[@href='/admin/compras/minero-subsistencia']\n");

    private final By documentTypeDropdown = By.id("sellerDocumentType");

    private final By cedulaOption = By.xpath("//select[@id='sellerDocumentType']/option[contains(text(), 'Cédula de ciudadanía')]");

    private final By sellerDocumentNumberTxt = By.id("sellerDocumentNumber");

    private final By lblsellerFirstName = By.id("sellerFirstName");

    private final By sellerFirstLastname = By.id("sellerFirstLastname");

    private final By sellerSecondLastname = By.id("sellerSecondLastname");

    private final By siguienteBtn = By.xpath("//button[@type='button' and contains(@class, 'bg-green-800')]");

    private final By fechaFacturabtn = By.id("invoiceDate");

    private final By shaBtn = By.id("barcode");

    private final By moneyDropdown = By.id("currency");

    private final By departmentDropdown = By.id("department");

    private final By cityDropdown = By.id("city");

    private final By plusBtn = By.xpath("(//button[@type='button' and contains(@class, 'bg-emerald-600')])[1]");

    private final By mineralTxt = By.id("mineral");

    private final By cantidadTxt = By.xpath("//input[@formcontrolname='cant']");

    private final By unidadTxt = By.xpath("//input[@formcontrolname='unit_measurement']");

    private final By precioTxt = By.xpath("//input[@formcontrolname='gross_price']");

    private final By guardarTxBtn = By.xpath("//button[normalize-space(text())='Guardar transacción']");

    private final By codeTxtBtn = By.id("transactionCode");

    private final By cerrarBtn = By.xpath("(//div[contains(@class, 'justify-center')]//button[contains(@class, 'inline-flex')])[1]");

    private final By TransactionIdField = By.id("transactionId");

    private final By confirmarTxBtn = By.xpath("//section[contains(@class, 'justify-start')]//button[normalize-space(text())='Confirmar transacción']");

    private final By mensajeConfirmacion = By.xpath("//p[contains(text(), 'La transacción')]");

    private final By mensajeVerificacion = By.xpath("//p[contains(text(), 'Se ha verificado de manera exitosa la transacción')]");

    public By getMensajeVerificacion() {
        return mensajeVerificacion;
    }

    public By getMensajeConfirmacion() {
        return mensajeConfirmacion;
    }

    public By getConfirmarTxBtn() {
        return confirmarTxBtn;
    }

    public By getCerrarBtn() {
        return cerrarBtn;
    }

    public By getCodeTxtBtn() {
        return codeTxtBtn;
    }

    public By getSiguienteBtn() {
        return siguienteBtn;
    }

    public By getLblsellerFirstName() {
        return lblsellerFirstName;
    }

    public By getSellerFirstLastname() {
        return sellerFirstLastname;
    }

    public By getSellerSecondLastname() {
        return sellerSecondLastname;
    }

    public By getDocumentTypeDropdown() {
        return documentTypeDropdown;
    }

    public By getCedulaOption() {
        return cedulaOption;
    }

    public By getMineroSubBtn() {
        return MineroSubBtn;
    }


    public By getComprasBtn() {
        return ComprasBtn;
    }

    public By getSellerDocumentNumberTxt() {
        return sellerDocumentNumberTxt;
    }

    public By getFechaFacturabtn() {
        return fechaFacturabtn;
    }

    public By getShaBtn() {
        return shaBtn;
    }

    public By getMoneyDropdown() {
        return moneyDropdown;
    }

    public By getDepartmentDropdown() {
        return departmentDropdown;
    }

    public By getCityDropdown() {
        return cityDropdown;
    }

    public By getPlusBtn() {
        return plusBtn;
    }

    public By getMineralTxt() {
        return mineralTxt;
    }

    public By getCantidadTxt() {
        return cantidadTxt;
    }

    public By getUnidadTxt() {
        return unidadTxt;
    }

    public By getPrecioTxt() {
        return precioTxt;
    }

    public By getGuardarTxBtn() {
        return guardarTxBtn;
    }

    public By getTransactionIdField() {
        return getTransactionIdField();
    }
}
