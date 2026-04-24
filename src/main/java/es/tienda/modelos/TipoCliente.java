package es.tienda.modelos;

public enum TipoCliente {
    POTENCIAL ("Potencial"),
    VIP("VIP"),
    NUEVO("Nuevo"),
    MOROSO("Moroso");

    private String descripcion;
    TipoCliente(String descripcion) {
        this.descripcion = descripcion;
    }
}
