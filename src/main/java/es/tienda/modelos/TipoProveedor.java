package es.tienda.modelos;

public enum TipoProveedor {
    SERVICIO ("Servicio"),
    RECURSOS("Recursos"),
    FABRICANTE("Fabricante");


    private String descripcion;

    TipoProveedor(String descripcion) {
        this.descripcion = descripcion;
    }
}
