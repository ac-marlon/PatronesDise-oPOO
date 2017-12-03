package parqueaderosingleton;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        boolean op2;
        int i = 45001;
        System.out.println("Servicio de parqueadero");
        do {
            System.out.println("Cliente #" + i++);
            System.out.println("Seleccione una opcion: \n");
            System.out.println("1) Ocupar Bahia...");
            System.out.println("2) Liberar Bahia...");
            Scanner s = new Scanner(System.in);
            int op = s.nextInt();
            ParqueaderoSingleton bahia;

            switch (op) {
                case 1:
                    try {
                        bahia = ParqueaderoSingleton.ocuparBahia("");
                        System.out.println(bahia.getEstado());
                    } catch (NullPointerException ex) {
                        System.out.println("Imposible acceder");
                    }
                    break;
                case 2:
                    try {
                        bahia = ParqueaderoSingleton.liberarBahia();
                        System.out.println(bahia.getEstado());
                    } catch (NullPointerException ex) {
                        System.out.println("");
                    }
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            System.out.println("¿Desea hacer mas cambios? (true/false)");
            op2 = s.nextBoolean();
        } while (op2 == true);
    }

}
