package es.tienda.modelos;

public class Articulo {
    private String codigo;
    private String descripcion;
    private Double precio;

    public Articulo(String codigo, String descripcion, Double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public Articulo alta () {
        return new Articulo("001","Guantes",23.00);
    }

    /**
     * Muestra los datos de un artículo
     */
    public void visualizarDatos(){
        System.out.printf("Código: %s, Descripción: %s, Precio:%5.2f",codigo,descripcion,precio);
    }
}
