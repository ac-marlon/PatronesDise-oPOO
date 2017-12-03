package parqueaderoiterador;

public class Cargo {

    private final Empleado[] empleados = new Empleado[40];
    private int numero = 0;
    private final String nombreCargo;

    public Cargo(String nombreDivision) {
        this.nombreCargo = nombreDivision;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void añadir(String nombre) {
        Empleado emp = new Empleado(nombre, nombreCargo);
        empleados[numero++] = emp;
    }

    public IteradorCargo Iterador() {
        return new IteradorCargo(empleados);
    }

}
