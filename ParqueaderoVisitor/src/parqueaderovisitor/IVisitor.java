package parqueaderovisitor;

public interface IVisitor {

    public double visit(ClienteFrecuente descuento);

    public double visit(ClienteVIP sinDescuento);

    public double visit(ClienteOcasional sinDescuento);
}
