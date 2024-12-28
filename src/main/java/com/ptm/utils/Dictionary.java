package com.ptm.utils;

public class Dictionary {

    private static final String msjTxExitosa = "Se ha verificado de manera exitosa la transacción";
    private static final String urlCal = "https://ptm-front-cal-hgd8hbgpdbcsbah2.eastus2-01.azurewebsites.net/login";
    private static final String msjConfirmacionTx = "La transacción \"4F9AC9AC-A099-46E3-A2F2-BFEE7F7DE75C\" ha sido registrada de manera exitosa. A los correos electrónicos tanto del vendedor como del comprador han sido enviadas las actualizaciones de saldos o cupos según corresponda.\n" + "\n";
     public static String getUrlCal() {
        return urlCal;
    }
}
