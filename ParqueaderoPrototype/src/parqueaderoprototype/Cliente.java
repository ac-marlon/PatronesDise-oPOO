package parqueaderoprototype;

import java.util.Scanner;

public class Cliente {

    public static void main(String args[]) throws CloneNotSupportedException {

        int op;
        GestorSeñalizacion gs = new GestorSeñalizacion();
        System.out.println("Gestor de señalizacion de transito de Parking Bogotá");
        System.out.println("¿Que señales de transito desea replicar?\n "
                + "1. Avisos ó 2. Vallas");
        Scanner s = new Scanner(System.in);
        op = s.nextInt();
        if (op == 1) {
            gs.clonarAvisoTr();
            System.out.println("¡Aviso generado!");
        } else if (op == 2) {
            gs.clonarVallaDl();
            System.out.println("¡Valla generada!");

        }

    }

}
