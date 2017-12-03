package parqueaderodecorador;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("Digite que vehiculo desea parquear:0\n1. Auto\n2. Moto \n3. Bicicleta");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        System.out.println("Digite la bahia en la que se encuentra");
        int bahia = s.nextInt();

        switch (opc) {
            case 1:
                System.out.println("¿Desea dejar su auto en la zona de lavado? (si/no)");
                String rta = s.next();
                if (rta.equalsIgnoreCase("si") == true) {

                    IParqueadero pA = new DecoradorLavaderoAuto(new Parqueadero());
                    System.out.println(pA.parquear(bahia, "Auto"));
                } else {
                    IParqueadero pA = new Parqueadero();
                    System.out.println(pA.parquear(bahia, "el auto "));
                }
                break;
            case 2:
                IParqueadero pM = new Parqueadero();
                System.out.println(pM.parquear(bahia, "la moto "));
                break;
            case 3:
                IParqueadero pB = new Parqueadero();
                System.out.println(pB.parquear(bahia, "la bicicleta "));
                break;
            default:
                System.err.println("Opcion invalida");
                break;
        }
    }

}
