package parqueaderometodofabrica;

public abstract class Factura {

    private int NIT;
    private String fechaExp;
    private String horaExp;
    private String nombreCLiente;
    private double cedulaCLiente;
    private double tiempoServicio;
    private int impuestos;
    private int valor;
    private String tipoVehiculo;

    public Factura(int NIT, String fechaExp, String horaExp, String nombreCLiente, double cedulaCLiente, double tiempoServicio, int impuestos, int valor, String tipoVehiculo) {
        this.NIT = NIT;
        this.fechaExp = fechaExp;
        this.horaExp = horaExp;
        this.nombreCLiente = nombreCLiente;
        this.cedulaCLiente = cedulaCLiente;
        this.tiempoServicio = tiempoServicio;
        this.impuestos = impuestos;
        this.valor = valor;
        this.tipoVehiculo = tipoVehiculo;
    }

    public abstract double totalPagar();

    public abstract String imprimir();

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getFechaExp() {
        return fechaExp;
    }

    public void setFechaExp(String fechaExp) {
        this.fechaExp = fechaExp;
    }

    public String getHoraExp() {
        return horaExp;
    }

    public void setHoraExp(String horaExp) {
        this.horaExp = horaExp;
    }

    public String getNombreCLiente() {
        return nombreCLiente;
    }

    public void setNombreCLiente(String nombreCLiente) {
        this.nombreCLiente = nombreCLiente;
    }

    public double getCedulaCLiente() {
        return cedulaCLiente;
    }

    public void setCedulaCLiente(double cedulaCLiente) {
        this.cedulaCLiente = cedulaCLiente;
    }

    public double getTiempoServicio() {
        return tiempoServicio;
    }

    public void setTiempoServicio(double tiempoServicio) {
        this.tiempoServicio = tiempoServicio;
    }

    public int getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(int impuestos) {
        this.impuestos = impuestos;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

}
