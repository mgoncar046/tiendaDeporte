package es.tienda.modelos;

import org.iesalandalus.programacion.utilidades.Entrada;
import java.util.ArrayList;

/**
 * @author  Alberto Fernandez Mateo
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Articulo> articulos = new ArrayList<>();

        System.out.println("=== CLIENTES ===");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Cliente " + i + ":");
            System.out.print("Nombre: ");
            String nombre = Entrada.cadena();
            System.out.print("Apellidos: ");
            String apellidos = Entrada.cadena();
            System.out.print("DNI: ");
            String dni = Entrada.cadena();
            System.out.print("Tipo (POTENCIAL/NUEVO/VIP/MOROSO): ");
            TipoCliente tipoCliente = TipoCliente.valueOf(Entrada.cadena().toUpperCase());
            clientes.add(Cliente.altaCliente(nombre, apellidos, dni, tipoCliente));
        }

        System.out.println("=== PROVEEDORES ===");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Proveedor " + i + ":");
            System.out.print("Nombre: ");
            String nombre = Entrada.cadena();
            System.out.print("Apellidos: ");
            String apellidos = Entrada.cadena();
            System.out.print("DNI: ");
            String dni = Entrada.cadena();
            System.out.print("Tipo (SERVICIO/RECURSOS/FABRICANTE): ");
            TipoProveedor tipoProveedor = TipoProveedor.valueOf(Entrada.cadena().toUpperCase());
            proveedores.add(Proveedor.altaProveedor(nombre, apellidos, dni, tipoProveedor));
        }

        System.out.println("=== ARTÍCULOS ===");
        for (int i = 1; i <= 2; i++) {
            System.out.println("Artículo " + i + ":");
            System.out.print("Código: ");
            String codigo = Entrada.cadena();
            System.out.print("Descripción: ");
            String descripcion = Entrada.cadena();
            System.out.print("Precio: ");
            double precio = Entrada.realDoble();
            articulos.add(Articulo.altaArticulo(codigo, descripcion, precio));
        }

        System.out.println("\n=== LISTADO DE CLIENTES ===");
        for (Cliente c : clientes) { c.mostrarDatos(); System.out.println("---"); }

        System.out.println("\n=== LISTADO DE PROVEEDORES ===");
        for (Proveedor p : proveedores) { p.mostrarDatos(); System.out.println("---"); }

        System.out.println("\n=== LISTADO DE ARTÍCULOS ===");
        for (Articulo a : articulos) { a.visualizarDatos(); System.out.println("---"); }
    }
}

