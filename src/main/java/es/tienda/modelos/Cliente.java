package es.tienda.modelos;

public class Cliente extends Persona {
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    private TipoCliente tipoCliente;
    public Cliente(String nombre, String apellidos, String dni) {
        super(nombre, apellidos, dni);
        setTipoCliente(TipoCliente.POTENCIAL);
    }

    @Override
    public void mostrarDatos() {
        //prueba de modificación
        System.out.printf("Nombre: %s , DNI:%s, TipoCliente:%s",
                getNombre(),getDni(),getTipoCliente());
    }


}
