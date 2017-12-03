package parqueaderovisitor;

public class Descuento implements IVisitor {

    @Override
    public double visit(ClienteFrecuente descuento) {
        double totalConDescuento;
        totalConDescuento = descuento.getTotal() - (descuento.getTotal() * 0.1);
        return totalConDescuento;
    }

    @Override
    public double visit(ClienteVIP sinDescuento) {
        return sinDescuento.getTotal();
    }

    @Override
    public double visit(ClienteOcasional sinDescuento) {
        return sinDescuento.getTotal();
    }

}
