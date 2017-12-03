package parqueaderofachada;

public class Cliente {

    public static void main(String[] args) {

        SistemaImpresion sisIFac = new SistemaImpresion();
        sisIFac.setTipoPapel("Papel Pergamino");
        sisIFac.setColor(false);
        sisIFac.setTipoRecibo("Factura");
        sisIFac.setCuerpoRecibo("NIT, fechaExp, horaExp, nombreYCedulaCliente, tiempo, vehiculo, totalPagar");
        sisIFac.imprimirDocumento();
        System.out.println("Imprimiendo:\n" + sisIFac.getCuerpoRecibo() + "\nColor:"
                + sisIFac.isColor() + ", Tipo:" + sisIFac.getTipoRecibo() + ", Hoja :" + sisIFac.getTipoPapel());

        SistemaImpresion sisIPanf = new SistemaImpresion();
        sisIPanf.setTipoPapel("Papel Fotografico");
        sisIPanf.setColor(true);
        sisIPanf.setTipoRecibo("Panfleto Publicitario");
        sisIPanf.setCuerpoRecibo("Bienvenido a Parking Bogotá: <lista de servicios y descuentos>");
        sisIPanf.imprimirDocumento();
        System.out.println("Imprimiendo:\n" + sisIPanf.getCuerpoRecibo() + "\nColor:"
                + sisIPanf.isColor() + ", Tipo:" + sisIPanf.getTipoRecibo() + ", Hoja :" + sisIPanf.getTipoPapel());

        SistemaImpresion sisIRec = new SistemaImpresion();
        sisIRec.setTipoPapel("Papel de Seguridad");
        sisIRec.setColor(false);
        sisIRec.setTipoRecibo("Recibo");
        sisIRec.setCuerpoRecibo("Recibo de descuento por el 60% en su proxima visita");
        sisIRec.imprimirDocumento();
        System.out.println("Imprimiendo:\n" + sisIRec.getCuerpoRecibo() + "\nColor:"
                + sisIRec.isColor() + ", Tipo:" + sisIRec.getTipoRecibo() + ", Hoja :" + sisIRec.getTipoPapel());

    }

}
