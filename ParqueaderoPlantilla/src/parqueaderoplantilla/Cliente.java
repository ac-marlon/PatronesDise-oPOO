package parqueaderoplantilla;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("Escoja el tipo de vehiculo que desea registrar\n1. Automovil\n2. Motocicleta\n3. Bicicleta");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();

        switch (opc) {
            case 1:
                System.out.println("Digite el nombre del cliente");
                String nombre = s.next();
                System.out.println("Digite la marca del auto");
                String marca = s.next();
                System.out.println("Digite el color del auto");
                String color = s.next();
                System.out.println("Digite la placa del auto");
                String placa = s.next();
                RegistroCarro rCarro = new RegistroCarro(nombre, marca, color, placa);
                System.out.println(rCarro.mostrarRegistro());
                break;
            case 2:
                System.out.println("Digite el nombre del cliente");
                nombre = s.next();
                System.out.println("Digite la marca de la moto");
                marca = s.next();
                System.out.println("Digite el color de la moto");
                color = s.next();
                System.out.println("Digite la placa de la moto");
                placa = s.next();
                RegistroMoto rMoto = new RegistroMoto(nombre, marca, color, placa);
                System.out.println(rMoto.mostrarRegistro());
                break;
            case 3:
                System.out.println("Digite el nombre del cliente");
                nombre = s.next();
                System.out.println("Digite la marca de la bicicleta");
                marca = s.next();
                System.out.println("Digite el color de la bicicleta");
                color = s.next();
                System.out.println("Digite la descripcion de la bicicleta");
                String descripcion = s.next();
                RegistroBicicleta rBici = new RegistroBicicleta(nombre, marca, color, descripcion);
                System.out.println(rBici.mostrarRegistro());
                break;

        }
    }

}
