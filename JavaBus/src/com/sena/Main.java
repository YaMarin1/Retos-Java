package com.sena;
import java.util.Scanner;
import com.sena.DAO.DAOVehiculo;
import com.sena.models.Vehiculo;

public class Main {

    public static void main(String[] args) {




        //ELIMINAMOS DATOS













        /*

        INSERTAMOS DATOS

        int opinion;
        boolean i = true;
        Vehiculo c = new Vehiculo();
        DAOVehiculo dao = new DAOVehiculo();

        while (i == true) {

            Scanner InputData = new Scanner(System.in);
            Scanner InputData2 = new Scanner(System.in);

            System.out.print("Placa: ");
            String placa = InputData.nextLine();
            c.setPlaca(placa);

            System.out.print("Marca: ");
            String marca = InputData.nextLine();
            c.setMarca(marca);

            System.out.print("Modelo: ");
            String modelo = InputData.nextLine();
            c.setModelo(modelo);

            System.out.print("Valor: ");
            double valor = InputData.nextDouble();
            c.setValorComercial(valor); InputData.nextLine();

            dao.createVehiculo(c);

            System.out.println("1: Ingresar otro vehiculo\n 2: Salir");
            opinion= InputData2.nextInt();

            if (opinion==1){
                continue;
            }else if (opinion==2) {
                i = false;
            }else {
                System.out.println("Dato incorrecto");
                i = false;
            }
        }
        */
    }

}
