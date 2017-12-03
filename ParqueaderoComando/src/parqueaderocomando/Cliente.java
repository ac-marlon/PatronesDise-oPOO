package parqueaderocomando;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Invocador inv = new Invocador();

        Receptor rec = new Receptor();

        IComando objAprobado = new ComandoAprobado(rec);
        IComando objDenegado = new ComandoDenegado(rec);

        inv.añadir(objAprobado);
        inv.añadir(objDenegado);

        System.out.println("Digite una opcion: \n1. Permitir el acceso al parqueadero"
                + "\n2. Denegar el acceso al parqueadero");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        switch (opc) {
            case 1:
                System.out.println(inv.getComando(0).comprobarPeticion());
                break;
            case 2:
                System.out.println(inv.getComando(1).comprobarPeticion());
                break;
            default:
                System.err.println("Opcion no valida.");
                break;
        }
    }

}
