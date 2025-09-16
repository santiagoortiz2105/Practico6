package model;
//Integrantes: Manceñido Xenia, Ortiz Lourdes, Ortiz Santiago, Ozan Santiago 
import java.util.TreeSet;

public class CatalogodeProductos {

    private static TreeSet<Producto> productos = new TreeSet<>();

    // Agregar producto
    public static boolean agregarProducto(Producto p) {
        return productos.add(p);
    }

    // Eliminar producto
    public static boolean eliminarProducto(Producto p) {
        return productos.remove(p);
    }

    // Buscar por el código
    public static Producto buscarPorCodigo(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }
// Buscar productos por precios

    public static TreeSet<Producto> buscarPorPrecio(double desde, double hasta) {
        TreeSet<Producto> filtrados = new TreeSet<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= desde && p.getPrecio() <= hasta) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }

    // Obtener todos los productos
    public static TreeSet<Producto> getProductos() {
        return productos;
    }

    //metodo para buscar por nombre
    public static TreeSet<Producto> buscarPorNombre(String texto) {
        TreeSet<Producto> filtrados = new TreeSet<>();
        String busqueda = texto.toLowerCase();
        for (Producto p : productos) {
            if (p.getDescripcion().toLowerCase().contains(busqueda)) {
                filtrados.add(p);
            }
        }
        return filtrados;
    }
}
