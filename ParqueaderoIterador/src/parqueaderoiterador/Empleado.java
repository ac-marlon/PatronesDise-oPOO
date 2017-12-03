package parqueaderoiterador;

class Empleado {

    private final String nombreEmp;
    private final String cargoEmp;

    public Empleado(String nombreEmp, String cargoEmp) {
        this.nombreEmp = nombreEmp;
        this.cargoEmp = cargoEmp;
    }

    public String getNombreEmp() {
        return nombreEmp;
    }

    public String imprimir() {
        return "Nombre: " + nombreEmp + ", Cargo: " + cargoEmp;
    }

}
