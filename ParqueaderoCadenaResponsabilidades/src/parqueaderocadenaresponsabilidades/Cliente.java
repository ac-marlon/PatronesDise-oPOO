package parqueaderocadenaresponsabilidades;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        clienteBahia cVIP = new clienteVIP();
        clienteBahia cFre = new clienteFrecuente();
        clienteBahia cOca = new clienteOcasional();

        cVIP.setSiguiente(cFre);
        cFre.setSiguiente(cOca);

        System.out.println("Digite el tipo de cliente que desea buscar la disponibilidad en las bahías:\n "
                + "(1 para Cliente VIP, 2 para Cliente Frecuente, 3 para Cliente Ocasional)");
        Scanner s = new Scanner(System.in);
        String seleccion = s.next();

        if (cVIP.disponibilidad(seleccion) != null) {
            System.out.println(cVIP.disponibilidad(seleccion));

        } else if (cFre.disponibilidad(seleccion) != null) {
            System.out.println(cFre.disponibilidad(seleccion));

        } else {
            System.out.println(cOca.disponibilidad(seleccion));
        }

    }

}
