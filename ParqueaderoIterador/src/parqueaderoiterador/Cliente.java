package parqueaderoiterador;

import java.util.Iterator;

public class Cliente {

    public static void main(String args[]) {
        Cargo div = new Cargo("Valet Parking");
        div.añadir("Empleado Marlon");
        div.añadir("Empleada Gabriela");
        div.añadir("Empleado Coco");

        Iterator<Empleado> iterador = div.Iterador();
        while (iterador.hasNext()) {
            Empleado emp = (Empleado) iterador.next();
            System.out.println(emp.imprimir());
        }
    }

}
