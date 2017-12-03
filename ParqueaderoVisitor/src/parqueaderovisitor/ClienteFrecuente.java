package parqueaderovisitor;

public class ClienteFrecuente implements ITipoCliente {

    private double total;

    @Override
    public double accept(IVisitor visitor) {
        return visitor.visit(this);
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

}
