/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.TreeSet; 
/**
 *
 * @author Lulim
 */
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
}
