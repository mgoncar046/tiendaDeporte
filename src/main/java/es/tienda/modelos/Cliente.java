package es.tienda.modelos;

/**
 * Clase clientes con su refactorizacion
 * @author ana
 */
public class Cliente extends Persona {

    public static final String CLIENTE_DADO_DE_ALTA = "=== Cliente dado de alta ===";
    private TipoCliente tipoCliente;

    /**
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param tipoCliente
     */
    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }

    /**
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param tipoCliente
     * @return
     */
    public static Cliente altaCliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente) {
        System.out.println(CLIENTE_DADO_DE_ALTA);
        return new Cliente(nombre, apellidos, dni, tipoCliente);
    }


    @Override
    public void mostrarDatos() {
        System.out.printf("Nombre: %s%nApellidos: %s%nDNI: %s%nTipo de cliente: %s%n",
                getNombre(), getApellidos(), getDni(), tipoCliente);
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}