package parqueaderoprototype;

public class AvisoTransito extends SeñalTransito {

    private String tipoBahia;

    public AvisoTransito(String mensaje, String tamaño, String color, String ubicacion) {
        super(mensaje, tamaño, color, ubicacion);
        setTipoBahia(tipoBahia);
    }

    public String getTipoBahia() {
        return tipoBahia;
    }

    public void setTipoBahia(String tipoBahia) {
        this.tipoBahia = tipoBahia;
    }

}
