package com.mycompany.sistemafinal.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane; 

public class Conexion {

    public static Connection conectar() {
        Connection conexion = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String servidor = "jdbc:mysql://localhost/sistemafinal?useSSL=false&serverTimezone=UTC";
            String user = "root";
            String pass = "";

            
            conexion = DriverManager.getConnection(servidor, user, pass);
        } catch (ClassNotFoundException | java.sql.SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexión: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            conexion = null;
        }

        return conexion;
    }
    
}
