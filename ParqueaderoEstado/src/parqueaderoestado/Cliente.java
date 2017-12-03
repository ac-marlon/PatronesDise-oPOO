package parqueaderoestado;

import java.util.Scanner;

public class Cliente {

    public static void main(String arg[]) {

        String opcion;

        System.out.println("Verificador de bahias de Parking Bogotá");
        ContextoParking contextoParking = new ContextoParking();
        Scanner s = new Scanner(System.in);
        System.out.println("¿Que tipo de vehiculo posee: carro, moto o bicicleta?");
        opcion = s.nextLine();

        if ("carro".equals(opcion.toLowerCase())) {
            EstadoBahia estadoBahiaDisp = new BahiaDisponible();
            contextoParking.setEstadoBahia(estadoBahiaDisp);
            contextoParking.peticion();
            System.out.println("Bahia Disponible");
        }

        if ("moto".equals(opcion.toLowerCase())) {
            EstadoBahia estadoBahiaOcu = new BahiaOcupada();
            contextoParking.setEstadoBahia(estadoBahiaOcu);
            contextoParking.peticion();
            System.out.println("Bahia Ocupada");
        }

        if ("bicicleta".equals(opcion.toLowerCase())) {
            EstadoBahia estadoBahiaMant = new BahiaMantenimiento();
            contextoParking.setEstadoBahia(estadoBahiaMant);
            contextoParking.peticion();
            System.out.println("Bahia en Mantenimiento");
        }

    }

}
