package com.sena.conexion;

import java.sql.*;

/**
 *
 * @author Edwin Patiño
 */
public class Conexion {

    private Connection conex;


    public Conexion(){

        try {
            Class.forName("com.mysql.jdbc.Driver");
            this.conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/BDtransportes","root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Error en conexion a base de datos" + ex.toString());
        }

    }
    public void desconectar() {
        try {
            this.conex.close();
        }
        catch (SQLException ex) {
        }
    }

    public PreparedStatement prepareStatement(String sql){
        try {
            return this.conex.prepareStatement(sql);
        } catch (Exception ex) {
            return null;
        }
    }

    public Connection getConexion(){
        return conex;
    }
}
