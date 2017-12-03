package parqueaderocomando;

public class ComandoAprobado implements IComando {

    Receptor r;

    public ComandoAprobado(Receptor r) {
        this.r = r;
    }

    @Override
    public String comprobarPeticion() {
        return r.accion("Aprobado");
    }

}
