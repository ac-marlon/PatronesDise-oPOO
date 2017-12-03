package parqueaderodecorador;

public abstract class DecoradorLavadero implements IParqueadero {

    protected IParqueadero parqueadero;

    public DecoradorLavadero(IParqueadero parqueadero) {
        this.setParqueadero(parqueadero);
    }

    public IParqueadero getParqueadero() {
        return this.parqueadero;
    }

    public void setParqueadero(IParqueadero parqueadero) {
        this.parqueadero = parqueadero;
    }

    @Override
    public String parquear(int bahia, String tipoParqueadero) {
        return this.getParqueadero().parquear(bahia, tipoParqueadero);
    }
}
