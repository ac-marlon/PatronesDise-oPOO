package parqueaderocadenaresponsabilidades;

public class clienteOcasional extends clienteBahia {

    @Override
    public String disponibilidad(String estado) {

        String cad = null;
        if ((estado != null) && (estado.equalsIgnoreCase("3") == true)) {
            cad = "En el sótano 3, hay bahías disponibles para el cliente ocasional";
        } else {
            if (this.getSiguiente() != null) {
                this.getSiguiente().disponibilidad(estado);
            }
        }
        return cad;
    }

}
