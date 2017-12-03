package parqueaderocadenaresponsabilidades;

public abstract class clienteBahia {

    protected clienteBahia siguiente;

    public clienteBahia getSiguiente() {
        return this.siguiente;
    }

    public void setSiguiente(clienteBahia b) {
        this.siguiente = b;
    }

    public abstract String disponibilidad(String estado);
}
