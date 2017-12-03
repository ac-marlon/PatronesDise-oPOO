package parqueaderocadenaresponsabilidades;

public class clienteVIP extends clienteBahia {

    @Override
    public String disponibilidad(String estado) {

        String cad = null;
        if ((estado != null) && (estado.equalsIgnoreCase("1") == true)) {
            cad = "En el sótano 1, hay bahías disponibles para un cliente VIP";
        } else {
            if (this.getSiguiente() != null) {
                this.getSiguiente().disponibilidad(estado);
            }
        }
        return cad;
    }

}
