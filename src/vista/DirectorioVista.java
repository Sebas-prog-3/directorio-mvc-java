
package vista;

import modelo.Producto;
import java.util.List;
import java.util.Scanner;

public class DirectorioVista {
   private Scanner scanner = new Scanner(System.in);

    public int mostrarMenu() {
        System.out.println("\n--- Menú Inventario ---");
        System.out.println("1. Agregar producto");
        System.out.println("2. Buscar producto por SKU");
        System.out.println("3. Mostrar todos los productos");
        System.out.println("4. Eliminar producto");
        System.out.println("5. Salir");
        System.out.print("Seleccione una opción: ");
        return scanner.nextInt();
    }

    public Producto pedirDatosUsuario() {
        System.out.print("Nombre: ");
        String nombre = scanner.next();

        System.out.print("SKU: ");
        String sku = scanner.next();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        return new Producto(nombre, sku, cantidad, precio);
    }

    public String pedirSku() {
        System.out.print("Ingrese el SKU: ");
        return scanner.next();
    }

    public void mostrarProducto(Producto producto) {
        if (producto != null)
            System.out.println(producto);
        else
            System.out.println("Producto no encontrado.");
    }

    public void mostrarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("No hay productos registrados.");
        } else {
            for (Producto p : productos) {
                System.out.println(p);
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
        }
}