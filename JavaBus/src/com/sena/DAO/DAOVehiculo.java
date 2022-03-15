package com.sena.DAO;
import com.sena.conexion.Conexion;
import com.sena.models.Vehiculo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DAOVehiculo extends Conexion {

    public void createVehiculo(Vehiculo v){
        Connection con = this.getConexion();
        String sql = "INSERT INTO tblVehiculo (placa,modelo,marca,valorComercial) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1,v.getPlaca());
            ps.setString(2,v.getModelo());
            ps.setString(3,v.getMarca());
            ps.setDouble(4,v.getValorComercial());
            System.out.println(ps.toString());
            ps.execute();

        } catch (SQLException e) {
            System.out.println( e.getMessage());
        }
    }

    public Vehiculo consultarVehiculo(String placa){

        return null;
    }

    public Vehiculo consultarVehiculoPorModelo(String modelo){

        return null;
    }

    public void updateVehiculo(Vehiculo v){

    }

    public void deleteVehiculo(Vehiculo v, int id){
        Connection con = this.getConexion();
        String sql = "INSERT INTO tblVehiculo (placa,modelo,marca,valorComercial) VALUES (?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,v.getPlaca());
            ps.setString(2,v.getModelo());
            ps.setString(3,v.getMarca());
            ps.setDouble(4,v.getValorComercial());
            System.out.println(ps.toString());
            ps.execute();

        } catch (SQLException e) {
            System.out.println( e.getMessage());
        }

    }
}
