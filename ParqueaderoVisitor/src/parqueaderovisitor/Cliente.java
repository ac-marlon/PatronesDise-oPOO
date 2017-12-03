package parqueaderovisitor;

import java.util.Scanner;

public class Cliente {

    private static final double TARIFA_VIP = 53.4;
    private static final double TARIFA_FRECUENTE = 63.6;
    private static final double TARIFA_OCACIONAL = 50.2;

    public static void main(String[] args) {

        System.out.println("Escoja una opcion:\n1. Cliente VIP\n2. Cliente frecuente\n3. Cliente ocasional");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        ClienteVIP vip = new ClienteVIP();
        ClienteFrecuente frec = new ClienteFrecuente();
        ClienteOcasional ocas = new ClienteOcasional();
        Descuento desc = new Descuento();

        switch (opc) {
            case 1:
                System.out.println("Dijite cuanto tiempo estuvo el cliente (en minutos)");
                double tiempoMinutos = s.nextDouble();
                double total = tiempoMinutos * TARIFA_VIP;
                vip.setTotal(total);
                double totalFinal = vip.accept(desc);
                System.out.println("Su total a pagar es: " + totalFinal);
                break;
            case 2:
                System.out.println("Dijite cuanto tiempo estuvo el cliente (en minutos)");
                tiempoMinutos = s.nextDouble();
                total = tiempoMinutos * TARIFA_FRECUENTE;

                if (tiempoMinutos >= 180) {
                    frec.setTotal(total);
                    totalFinal = frec.accept(desc);
                    System.out.println("Su total a pagar es: " + totalFinal);
                } else {
                    totalFinal = tiempoMinutos * TARIFA_FRECUENTE;
                    System.out.println("Su total a pagar es: " + totalFinal);
                }
                break;
            case 3:
                System.out.println("Dijite cuanto tiempo estuvo el cliente (en minutos)");
                tiempoMinutos = s.nextDouble();
                total = tiempoMinutos * TARIFA_OCACIONAL;
                ocas.setTotal(total);
                totalFinal = ocas.accept(desc);
                System.out.println("Su total a pagar es: " + totalFinal);
                break;
            default:
                System.err.println("Opcion invalida");
                break;
        }
    }

}
