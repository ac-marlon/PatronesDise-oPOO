package parqueaderofachada;

public class GestorRecibo {

    public void generadorFachadas() {

        FachadaImpresion fachada1 = new FachadaImpresion("texto1");
        fachada1.imprimir();

        FachadaImpresion fachada2 = new FachadaImpresion("texto2");
        fachada2.imprimir();

    }

}
