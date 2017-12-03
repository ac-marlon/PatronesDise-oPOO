package parqueaderomemento;

public class Memento {

    private String nCliente, fecha, hora, tipoParqueadero;

    public Memento(String nCliente, String fecha, String hora, String tipoParqueadero) {

        this.nCliente = nCliente;
        this.fecha = fecha;
        this.hora = hora;
        this.tipoParqueadero = tipoParqueadero;
    }

    public String getnCliente() {
        return nCliente;
    }

    public void setnCliente(String nCliente) {
        this.nCliente = nCliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipoParqueadero() {
        return tipoParqueadero;
    }

    public void setTipoParqueadero(String tipoParqueadero) {
        this.tipoParqueadero = tipoParqueadero;
    }

}
