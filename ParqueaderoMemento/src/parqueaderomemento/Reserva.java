package parqueaderomemento;

public class Reserva {

    private String hora;
    private String fecha;
    private String nCliente;
    private String tipoParqueadero;

    public Reserva(String nCliente, String fecha, String hora, String tipoParqueadero) {
        this.nCliente = nCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoParqueadero = tipoParqueadero;
    }

    public void setMemento(Memento m) {
        this.nCliente = m.getnCliente();
        this.fecha = m.getFecha();
        this.hora = m.getHora();
        this.tipoParqueadero = m.getTipoParqueadero();
    }

    public Memento crearMemento() {
        return new Memento(nCliente, fecha, hora, tipoParqueadero);
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getnCliente() {
        return nCliente;
    }

    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
    }

    public String getTipoParqueadero() {
        return tipoParqueadero;
    }

    public void setTipoParqueadero(String tipoParqueadero) {
        this.tipoParqueadero = tipoParqueadero;
    }

}
