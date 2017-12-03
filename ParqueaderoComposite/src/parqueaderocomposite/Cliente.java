package parqueaderocomposite;

import java.util.Scanner;

public class Cliente {

    public static void main(String[] args) {

        System.out.println("Introduzca algun componente que desea agregar al parqueadero\n1. Nivel\n2. Zonas de servicio");
        Scanner s = new Scanner(System.in);
        int opc = s.nextInt();
        AbstractCompositor aS = new AreaServicio();
        AbstractCompositor n = new Niveles();
        AbstractCompositor p = new Parqueadero();

        switch (opc) {
            case 1:
                System.out.println(p.agregarNiveles(n));
                break;
            case 2:
                System.out.println(n.agregarAreaServicio(aS));
                break;
            default:
                System.err.println("Opcion no valida");
        }
    }

}
