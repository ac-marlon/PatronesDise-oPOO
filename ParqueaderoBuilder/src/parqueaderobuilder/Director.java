package parqueaderobuilder;

public class Director {

    public void construirNivel(BuilderNivel nivel) {

        nivel.crearNivel();
        nivel.construirBahias();
        nivel.construirCamaras();
        nivel.construirSalidasEmergencia();
    }
}
