package parqueaderobridge;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("Escoja el cargo que desea asignar a un empleado\n1. Administrador"
                + "\n2. Cajero\n3. Vigilante");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        System.out.println("Digite el nombre del empleado");
        String nombre = s.next();
        switch (opc) {
            case 1:
                Personal p = new Empleado(new Admin(nombre));
                System.out.println(p.añadir());
                break;
            case 2:
                p = new Empleado(new Cajero(nombre));
                System.out.println(p.añadir());
                break;
            case 3:
                p = new Empleado(new Vigilante(nombre));
                System.out.println(p.añadir());
                break;
            default:
                System.err.println("Opcion no valida");
                break;
        }
    }

}
