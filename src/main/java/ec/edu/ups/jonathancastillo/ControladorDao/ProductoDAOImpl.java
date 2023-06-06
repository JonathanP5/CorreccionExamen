/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.jonathancastillo.ControladorDao;

import ec.edu.ups.jonathancastillo.modelo.Producto;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author ESTUDIANTE
 */
public class ProductoDAOImpl implements ProductoDAO {
    private Map<String, Producto> productos;

    public ProductoDAOImpl() {
        productos = new HashMap<>();
    }
    
    public void crearProducto(Producto producto) {
        int index = 
        productos.add(producto.getCodigo(), producto);
    }

    public void actualizarProducto(Producto producto) {
        productos.update(producto.getCodigo(), producto);
    }

    public void eliminarProducto(String codigo) {
        productos.remove(codigo);
    }
    
    @Override
    public List<Producto> obtenerTodosLosProductos() {
        return new ArrayList<>(productos.values());
    }

    @Override
    public Producto obtenerProducto(String codigo) {
        
        return null;
        
    }

    @Override
    public Object leerProducto(Producto producto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

