package es.tienda.modelos;

/**
 * @author IdairaSuanez
 *
 */
public class Proveedor extends Persona {

    public static final String PROVEEDOR_DADO_DE_ALTA = "=== Proveedor dado de alta ===";
    private TipoProveedor tipoProveedor;

    /**
     *
     *
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param tipoProveedor
     */
    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        super(nombre, apellidos, dni);
        this.tipoProveedor = tipoProveedor;
    }
    /**
     *
     * @param nombre
     * @param apellidos
     * @param dni
     * @param tipoProveedor
     * @return
     */
    public static Proveedor altaProveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        System.out.println(PROVEEDOR_DADO_DE_ALTA);
        return new Proveedor(nombre, apellidos, dni, tipoProveedor);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Nombre: %s%nApellidos: %s%nDNI: %s%nTipo de proveedor: %s%n",
                getNombre(), getApellidos(), getDni(), tipoProveedor);
    }

    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }
}
