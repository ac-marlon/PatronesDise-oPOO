package parqueaderobuilder;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        Director director = new Director();

        BuilderNivel nivelVIP = new NivelesVIP();
        BuilderNivel nivelFrec = new NivelFrecuente();
        BuilderNivel nivelOcas = new NivelOcasional();

        System.out.println("Escoja para que tipo de parqueadero desea construirle un nuevo nivel: \n"
                + "1. Parqueadero para clientes VIP\n2. Parqueadero para clientes frecuentes\n3. Parqueadero para clientes ocasionales");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 1:
                director.construirNivel(nivelVIP);
                Nivel nVIP = nivelVIP.getNivel();
                mostrarCaracteristicas(nVIP);
                break;
            case 2:
                director.construirNivel(nivelFrec);
                Nivel nFrec = nivelFrec.getNivel();
                mostrarCaracteristicas(nFrec);
                break;
            case 3:
                director.construirNivel(nivelOcas);
                Nivel nOcas = nivelOcas.getNivel();
                mostrarCaracteristicas(nOcas);
                break;
            default:
                System.err.println("Opcion no valida");
        }
    }

    public static void mostrarCaracteristicas(Nivel nivel) {

        System.out.println("Bahias: " + nivel.getBahia());
        System.out.println("Camaras de seguridad: " + nivel.getCamara());
        System.out.println("Salidas de emergencia: " + nivel.getSalidaEmergencia());
    }

}
