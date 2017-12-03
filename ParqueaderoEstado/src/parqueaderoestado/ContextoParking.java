package parqueaderoestado;

public class ContextoParking {

    private EstadoBahia estadoBahia;

    public void setEstadoBahia(EstadoBahia estadoBahia) {
        this.estadoBahia = estadoBahia;
    }

    public EstadoBahia getEstadoBahia() {
        return estadoBahia;
    }

    public void peticion() {
        estadoBahia.manejadorBahia();
    }

}
