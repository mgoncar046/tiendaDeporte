package es.tienda.modelos;

/**
 * @autor PabloYebraGarcia
 */
public class Articulo {

    public static final String MENSAJE_ALTA = "=== Artículo dado de alta ===";
    private String codigo;
    private String descripcion;
    private double precio;

    /**
     *
     * @param codigo
     * @param descripcion
     * @param precio
     */
    public Articulo(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    /**
     *
     * @param codigo
     * @param descripcion
     * @param precio
     * @return
     */

    public static Articulo altaArticulo(String codigo, String descripcion, double precio) {
        System.out.println(MENSAJE_ALTA);
        return new Articulo(codigo, descripcion, precio);
    }

    public void visualizarDatos() {
        System.out.printf("Código: %s%nDescripción: %s%nPrecio: %.2f%n",
                codigo, descripcion, precio);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
