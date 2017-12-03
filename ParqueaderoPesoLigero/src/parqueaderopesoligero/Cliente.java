package parqueaderopesoligero;

import java.util.Scanner;

public class Cliente {

    private static String[] nombreCliente, placa, modelo, color, marca;
    private static int[] bahia, tiempoMin;

    public static void main(String[] args) {

        FlyweightFactory flyParqueadero = new FlyweightFactory();

        System.out.println("Elija una opcion:\n1. Generar factura a un carro\n2. Generar factura a una moto\n3. Generar factura a una bicicleta");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 1:

                System.out.println("¿A cuantos carros le desea generar la factura?");
                opc = s.nextInt();
                bahia = new int[opc];
                nombreCliente = new String[opc];
                placa = new String[opc];
                tiempoMin = new int[opc];
                modelo = new String[opc];
                marca = new String[opc];

                for (int i = 0; i < opc; i++) {
                    System.out.println("Introduzca el numero de bahia: ");
                    bahia[i] = s.nextInt();
                    System.out.println("Introduzca el nombre del propietario: ");
                    nombreCliente[i] = s.next();
                    System.out.println("Introduzca la placa del carro: ");
                    placa[i] = s.next();
                    System.out.println("Introduzca el tiempo que estuvo en el parqueadero (minutos): ");
                    tiempoMin[i] = s.nextInt();
                    System.out.println("Introduzca el modelo del carro: ");
                    modelo[i] = s.next();
                    System.out.println("Introduzca la marca del carro: ");
                    marca[i] = s.next();
                    System.out.println("__________________________________________");
                }

                flyParqueadero.facturarCarros(opc, bahia, nombreCliente, marca, modelo, placa, tiempoMin);
                break;
            case 2:
                System.out.println("¿A cuantas motos le desea generar la factura?");
                opc = s.nextInt();
                bahia = new int[opc];
                nombreCliente = new String[opc];
                placa = new String[opc];
                tiempoMin = new int[opc];
                modelo = new String[opc];
                marca = new String[opc];

                for (int i = 0; i < opc; i++) {
                    System.out.println("Introduzca el numero de bahia: ");
                    bahia[i] = s.nextInt();
                    System.out.println("Introduzca el nombre del propietario: ");
                    nombreCliente[i] = s.next();
                    System.out.println("Introduzca la placa de la moto: ");
                    placa[i] = s.next();
                    System.out.println("Introduzca el tiempo que estuvo en el parqueadero (minutos): ");
                    tiempoMin[i] = s.nextInt();
                    System.out.println("Introduzca el modelo de la moto: ");
                    modelo[i] = s.next();
                    System.out.println("Introduzca la marca de la moto: ");
                    marca[i] = s.next();
                    System.out.println("__________________________________________");
                }

                flyParqueadero.facturarMotos(opc, bahia, nombreCliente, marca, modelo, placa, tiempoMin);
                break;
            case 3:
                System.out.println("¿A cuantas bicicletas le desea generar la factura?");
                opc = s.nextInt();
                bahia = new int[opc];
                nombreCliente = new String[opc];
                tiempoMin = new int[opc];
                marca = new String[opc];
                color = new String[opc];

                for (int i = 0; i < opc; i++) {
                    System.out.println("Introduzca el numero de bahia: ");
                    bahia[i] = s.nextInt();
                    System.out.println("Introduzca el nombre del propietario: ");
                    nombreCliente[i] = s.next();
                    System.out.println("Introduzca el tiempo que estuvo en el parqueadero (minutos): ");
                    tiempoMin[i] = s.nextInt();
                    System.out.println("Introduzca el marca de la bicicleta: ");
                    marca[i] = s.next();
                    System.out.println("Introduzca el color de la bicicleta: ");
                    color[i] = s.next();
                    System.out.println("__________________________________________");
                }
                flyParqueadero.facturarBicicletas(opc, bahia, nombreCliente, marca, color, tiempoMin);
                break;
            default:
                System.err.println("Opcion incorrecta");
        }
    }

}
