package parqueaderofachada;

public class SistemaImpresion {

    private String tipoRecibo;
    private String tipoPapel;
    private boolean color;
    private String cuerpoRecibo;

    public String getTipoRecibo() {
        return tipoRecibo;
    }

    public void setTipoRecibo(String tipoRecibo) {
        this.tipoRecibo = tipoRecibo;
    }

    public String getTipoPapel() {
        return tipoPapel;
    }

    public void setTipoPapel(String tipoPapel) {
        this.tipoPapel = tipoPapel;
    }

    public boolean isColor() {
        return color;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public String getCuerpoRecibo() {
        return cuerpoRecibo;
    }

    public void setCuerpoRecibo(String cuerpoRecibo) {
        this.cuerpoRecibo = cuerpoRecibo;
    }

    public String imprimirDocumento() {
        return "Cola de impresion";
    }
}
