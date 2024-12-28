package com.ptm.utils;

import java.sql.*;

public class DatabaseUtils {
    private static final String CONNECTION_URL = DatabaseConfig.getProperty("db.url");
    private static final String USER = DatabaseConfig.getProperty("db.user");
    private static final String PASSWORD = DatabaseConfig.getProperty("db.password");

    private static final String CONNECTION_URLCAL = DatabaseConfig.getProperty("db.urlCAL");
    private static final String USERCAL = DatabaseConfig.getProperty("db.userCAL");
    private static final String PASSWORDCAL = DatabaseConfig.getProperty("db.passwordCAL");

    public static String getAuthenticationCode(String email) {
        String code = null;

        try (Connection conn = DriverManager.getConnection(CONNECTION_URL, USER, PASSWORD)) {

            String query = "SELECT TOP 1 code FROM [dbo].[auth_code_activation] WHERE email = ? ORDER BY id DESC";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, email);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        code = rs.getString("code");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Código de error: " + e.getErrorCode());
            throw new RuntimeException("Error al obtener el código de autenticación para el email: " + email, e);
        }

        return code;
    }

    public static String getVerificationTXCode(String miningactorid) {
        String code = null;

        try (Connection conn = DriverManager.getConnection(CONNECTION_URLCAL, USERCAL, PASSWORDCAL)) {

            String query = "select top (1) * from orq_system_validation where mining_actor_id = ? order by id desc";

            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, miningactorid);

                try (ResultSet rs = pstmt.executeQuery()) {
                    if (rs.next()) {
                        code = rs.getString("code");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error SQL: " + e.getMessage());
            System.out.println("Estado SQL: " + e.getSQLState());
            System.out.println("Código de error: " + e.getErrorCode());
            throw new RuntimeException("Error al obtener el código de autenticación para el mining actor id: " + miningactorid, e);
        }

        return code;
    }


}