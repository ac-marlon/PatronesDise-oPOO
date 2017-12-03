package parqueaderoprototype;

public abstract class SeñalTransito implements Cloneable {

    private String mensaje;
    private String tamaño;
    private String color;
    private String ubicacion;

    public SeñalTransito(String mensaje, String tamaño, String color, String ubicacion) {
        this.mensaje = mensaje;
        this.tamaño = tamaño;
        this.color = color;
        this.ubicacion = ubicacion;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

}
