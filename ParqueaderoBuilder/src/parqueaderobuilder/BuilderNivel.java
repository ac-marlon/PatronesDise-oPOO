package parqueaderobuilder;

public abstract class BuilderNivel {

    protected Nivel nivel;

    public Nivel getNivel() {
        return this.nivel;
    }

    public void crearNivel() {
        this.nivel = new Nivel();
    }

    public abstract void construirBahias();

    public abstract void construirCamaras();

    public abstract void construirSalidasEmergencia();

}
