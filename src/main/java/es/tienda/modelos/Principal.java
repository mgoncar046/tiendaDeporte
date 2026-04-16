package es.tienda.modelos;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Articulo> articulos = new ArrayList<>();

        System.out.println("===== CREACIÓN DE CLIENTES =====");

        for (int i = 0; i < 4; i++) {

            System.out.println("\nCliente " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("DNI: ");
            String dni = sc.nextLine();

            clientes.add(Cliente.darDeAlta(nombre, apellidos, dni));
        }

        System.out.println("\n===== CREACIÓN DE PROVEEDORES =====");

        for (int i = 0; i < 3; i++) {

            System.out.println("\nProveedor " + (i + 1));

            System.out.print("Nombre: ");
            String nombre = sc.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = sc.nextLine();

            System.out.print("DNI: ");
            String dni = sc.nextLine();

            System.out.println("Tipo de proveedor:");
            System.out.println("1 - SERVICIO");
            System.out.println("2 - RECURSOS");
            System.out.println("3 - FABRICANTE");

            int opcion = Integer.parseInt(sc.nextLine());

            TipoProveedor tipo;

            switch (opcion) {
                case 1:
                    tipo = TipoProveedor.SERVICIO;
                    break;
                case 2:
                    tipo = TipoProveedor.RECURSOS;
                    break;
                case 3:
                    tipo = TipoProveedor.FABRICANTE;
                    break;
                default:
                    tipo = TipoProveedor.SERVICIO;
            }

            proveedores.add(
                    Proveedor.altaProveedor(nombre, apellidos, dni, tipo)
            );
        }

        articulos.add(
                Articulo.alta("A001", "Teclado mecánico", 49.99)
        );

        articulos.add(
                Articulo.alta("A002", "Ratón gaming", 29.95)
        );

        System.out.println("\n===== CLIENTES CREADOS =====");

        for (Cliente cliente : clientes) {
            cliente.mostrarDatos();
        }
        System.out.println("\n===== PROVEEDORES CREADOS =====");

        for (Proveedor proveedor : proveedores) {
            proveedor.mostrarDatos();
        }
        System.out.println("\n===== ARTÍCULOS CREADOS =====");

        for (Articulo articulo : articulos) {
            articulo.visualizarDatos();
        }
        sc.close();
    }
}