package parqueaderoiterador;

import java.util.Iterator;

public class IteradorCargo implements Iterator<Empleado> {

    private final Empleado[] empleado;
    private int location = 0;

    public IteradorCargo(Empleado[] emp) {
        empleado = emp;
    }

    @Override
    public boolean hasNext() {
        return location < empleado.length && empleado[location] != null;

    }

    @Override
    public Empleado next() {
        return empleado[location++];
    }

}
