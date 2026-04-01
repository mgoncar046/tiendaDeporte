package es.tienda.modelos;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Artículo");
        Articulo articulo=new Articulo("001","CASCO BICI",24.67);
        articulo.visualizarDatos();
        System.out.println("\nOtro Articulo");
        articulo=articulo.alta();
        articulo.visualizarDatos();
        System.out.println("\nCliente");
        Cliente cliente=new Cliente("Alfonso","Hermoso","34564442T");
        cliente.mostrarDatos();
        System.out.println("\nProveedor");
        Proveedor proveedor=new Proveedor("TodoXTi","Serena","B346939933");
        proveedor.mostrarDatos();
        System.out.println("\nOtro proveedor");
        proveedor=proveedor.alta();
        proveedor.setTipoProveedor(TipoProveedor.RECURSOS);
        proveedor.mostrarDatos();
        System.out.println("Creando conflicto desde local");
    }
}
