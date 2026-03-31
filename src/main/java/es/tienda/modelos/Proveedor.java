package es.tienda.modelos;

public class Proveedor extends Persona {
    private TipoProveedor tipoProveedor;
    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        this.tipoProveedor = tipoProveedor;
    }


    public Proveedor(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        setTipoProveedor(TipoProveedor.FABRICANTE);
    }

    @Override
    public void mostrarDatos() {
        System.out.printf("Nombre: %s , DNI:%s, TipoProveedor:%s",
                getNombre(),getDni(),getTipoProveedor());
    }
    public Proveedor alta(){
        return new Proveedor("Antonio", "De las Heras","456999449D");
    }
}
