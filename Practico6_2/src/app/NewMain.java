package app;
//Integrantes: Manceñido Xenia, Ortiz Lourdes, Ortiz Santiago, Ozan Santiago 
import javax.swing.JFrame;
import javax.swing.JDesktopPane;
import vistas.frmGestiondeProductos;

public class NewMain {

    public static void main(String[] args) {
        // Ventana principal
        JFrame ventana = new JFrame("Gestión de Productos");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Se crea el escritorio
        JDesktopPane escritorio = new JDesktopPane();
        ventana.add(escritorio);

        // se crea la ventana de Gestión de Productos
        frmGestiondeProductos frmProductos = new frmGestiondeProductos();
        frmProductos.setVisible(true);

        // Se agrega al escritorio
        escritorio.add(frmProductos);

        // Se muestra la ventana principal 
        ventana.setVisible(true);
    }
}
