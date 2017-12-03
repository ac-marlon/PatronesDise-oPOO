package parqueaderometodofabrica;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        String tipoVehiculo;
        System.out.println("Bienvenido al Generador de Facturas de Parking Bogotá");
        System.out.println("Cual es su tipo de vehiculo: ");
        Scanner s = new Scanner(System.in);
        tipoVehiculo = s.nextLine();
        FacturaFactoryMethod facturaFM = new FacturaFactory();
        Factura factura = facturaFM.generarFactura(27392, "28/05/2017", "2:40 pm", "Benigno Malavista", 1033782449, 4, 19, 12000, tipoVehiculo);
        System.out.println(factura.imprimir());
        System.out.println("Total a pagar: " + factura.totalPagar());

    }

}
