package parqueaderocomando;

public class ComandoDenegado implements IComando {

    Receptor r;

    public ComandoDenegado(Receptor r) {
        this.r = r;
    }

    @Override
    public String comprobarPeticion() {
        return r.accion("Denegado");
    }

}
