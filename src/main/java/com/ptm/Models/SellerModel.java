package com.ptm.Models;

public class SellerModel {

    private String NumeroDocumento;
    private String FirstName;
    private String FirstLastName;
    private String SecondLastName;

    public SellerModel(String numeroDocumento, String firstName, String firstLastName, String secondLastName) {
        NumeroDocumento = numeroDocumento;
        FirstName = firstName;
        FirstLastName = firstLastName;
        SecondLastName = secondLastName;
    }

    public String getNumeroDocumento() {
        return NumeroDocumento;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getFirstLastName() {
        return FirstLastName;
    }

    public String getSecondLastName() {
        return SecondLastName;
    }
}
