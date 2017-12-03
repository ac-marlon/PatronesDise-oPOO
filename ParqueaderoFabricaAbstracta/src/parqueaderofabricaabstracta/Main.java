package parqueaderofabricaabstracta;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("¿Que vehiculo desea parquear?\n1. Auto\n2. Moto \n3. Bicicleta");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        System.out.println("¿Que tipo de parqueadero va a utilizar? (VIP, frecuente, ocasional)");
        String tipoParqueadero = s.next();
        Cliente c;

        switch (opc) {
            case 1:
                c = new Cliente(new FabricaParqueaderoCarro(), tipoParqueadero);
                break;
            case 2:
                c = new Cliente(new FabricaParqueaderoMoto(), tipoParqueadero);
                break;
            case 3:
                c = new Cliente(new FabricaParqueaderoBicicleta(), tipoParqueadero);
                break;
            default:
                System.err.println("Opcion no valida");
        }
    }

}
