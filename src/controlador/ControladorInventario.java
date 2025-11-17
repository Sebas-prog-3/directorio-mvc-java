
package controlador;

import modelo.BaseDeDatos;
import modelo.Producto;
import vista.DirectorioVista;

public class ControladorInventario {
     private BaseDeDatos baseDatos;
    private DirectorioVista vista;

    public ControladorInventario(BaseDeDatos baseDatos, InventarioVista vista) {
        this.baseDatos = baseDatos;
        this.vista = vista;
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1 -> {
                    Producto p = vista.pedirDatosUsuario();
                    baseDatos.agregarProducto(p);
                    vista.mostrarMensaje("Producto agregado correctamente.");
                }
                case 2 -> {
                    String sku = vista.pedirSku();
                    Producto p = baseDatos.buscarProductoSku(sku);
                    vista.mostrarProducto(p);
                }
                case 3 -> vista.mostrarProductos(baseDatos.buscarTodos());
                case 4 -> {
                    String sku = vista.pedirSku();
                    boolean eliminado = baseDatos.eliminarProducto(sku);
                    if (eliminado)
                        vista.mostrarMensaje("Producto eliminado.");
                    else
                        vista.mostrarMensaje("No se encontró el producto.");
                }
                case 5 -> salir = true;
                default -> vista.mostrarMensaje("Opción inválida.");
            }
        }
    }
    
}
