package parqueaderoprototype;

public class VallaDelimitadora extends SeñalTransito {

    private String nivelParqueadero;

    public VallaDelimitadora(String mensaje, String tamaño, String color, String ubicacion) {
        super(mensaje, tamaño, color, ubicacion);
        setNivelParqueadero(nivelParqueadero);
    }

    public String getNivelParqueadero() {
        return nivelParqueadero;
    }

    public void setNivelParqueadero(String nivelParqueadero) {
        this.nivelParqueadero = nivelParqueadero;
    }

}
