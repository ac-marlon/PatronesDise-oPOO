package parqueaderoprototype;

public class GestorSeñalizacion {

    AvisoTransito avisoTr;
    VallaDelimitadora vallaDel;

    public GestorSeñalizacion() {
        avisoTr = new AvisoTransito("¡Peligro! Maxima altura: 2.40 mts", "120 cm", "Amarillo y Negro", "Entrada parqueadero");
        vallaDel = new VallaDelimitadora("Distancia a la pared: 20 cm", "150 cm", "Rojo y Blanco", "Costado bahias");

    }

    public void clonarAvisoTr() throws CloneNotSupportedException {
        avisoTr.clone();

    }

    public void clonarVallaDl() throws CloneNotSupportedException {
        vallaDel.clone();

    }

}
