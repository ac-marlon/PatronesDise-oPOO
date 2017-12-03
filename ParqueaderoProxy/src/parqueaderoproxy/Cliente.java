package parqueaderoproxy;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        HistorialClientesProxy hcp = new HistorialClientesProxy();
        System.out.println("Ingrese el nombre de usuario para acceder al historial de clientes");
        Scanner s = new Scanner(System.in);
        String eleccion = s.next();
        System.out.println(hcp.accederHistorial(eleccion));
    }

}
