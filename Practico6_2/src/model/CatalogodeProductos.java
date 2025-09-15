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

    // Buscar por código
    public static Producto buscarPorCodigo(int codigo) {
        for (Producto p : productos) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }

    // Obtener todos los productos
    public static TreeSet<Producto> getProductos() {
        return productos;
    }
}
