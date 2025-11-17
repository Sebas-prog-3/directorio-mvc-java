import modelo.BaseDeDatos;
import vista.DirectorioVista;
import controlador.ControladorInventario;

public class App {
    public static void main(String[] args) {
        BaseDeDatos modelo = new BaseDeDatos();
        DirectorioVista vista = new DirectorioVista();
        ControladorInventario controlador = new ControladorInventario(modelo, vista);

        controlador.iniciar();
    }
}