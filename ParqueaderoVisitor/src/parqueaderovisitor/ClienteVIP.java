package parqueaderovisitor;

public class ClienteVIP implements ITipoCliente {

    private double total;

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
