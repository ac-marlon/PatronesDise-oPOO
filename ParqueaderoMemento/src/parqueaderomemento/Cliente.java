package parqueaderomemento;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("Escoja una de las opciones\n1. Registrar reserva\n2. Modificar reserva");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        GestorReservas gr = new GestorReservas();
        switch (opc) {
            case 1:
                System.out.println("Digite el nombre del cliente:");
                String nombre = s.next();
                System.out.println("Digite la fecha de la reserva:");
                String fecha = s.next();
                System.out.println("Digite la hora de la reserva: ");
                String hora = s.next();
                System.out.println("Digite el tipo de parqueadero que desea:");
                String tParqueadero = s.next();
                Reserva reservar = new Reserva(nombre, fecha, hora, tParqueadero);
                gr.setMemento(reservar.crearMemento());
                System.out.println("Reserva registrada, los datos registrados son:"
                        + "Nombre del cliente: " + reservar.getnCliente()
                        + "\nFecha reserva: " + reservar.getFecha() + "\nHora de la reserva: "
                        + reservar.getHora() + "\nTipo de parqueadero: " + reservar.getTipoParqueadero());
                break;

            case 2:
                System.out.println("Digite el nombre del cliente:");
                nombre = s.next();
                System.out.println("Digite la nueva fecha de reserva: ");
                fecha = s.next();
                System.out.println("Digite la nueva hora de reserva: ");
                hora = s.next();
                System.out.println("Digite el tipo de parqueadero:");
                tParqueadero = s.next();
                reservar = new Reserva(nombre, fecha, hora, tParqueadero);
                System.out.println("Se ha modificado los datos de la reserva.\n Los nuevos datos registrados son:"
                        + "\nNombre cliente: " + reservar.getnCliente()
                        + "\nFecha de la reserva: " + reservar.getFecha()
                        + "\nHora de la reserva: " + reservar.getHora()
                        + "\nTipo de parqueadero: " + reservar.getTipoParqueadero());
                break;
            default:
                System.err.println("Opcion invalida");
        }
    }

}
