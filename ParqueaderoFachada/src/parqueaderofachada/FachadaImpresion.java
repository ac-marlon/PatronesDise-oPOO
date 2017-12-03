package parqueaderofachada;

public class FachadaImpresion {

    SistemaImpresion impresora;

    public FachadaImpresion(String texto) {
        super();
        impresora = new SistemaImpresion();
        impresora.setColor(true);
        impresora.setTipoPapel("Papel Fotografico");
        impresora.setTipoRecibo("Panfleto Publicitario");
        impresora.setCuerpoRecibo(texto);
    }

    public void imprimir() {

        impresora.imprimirDocumento();
    }

}
