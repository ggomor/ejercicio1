package service;

import caso1.formativa.model.Producto;
import repository.ProductoRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getProductos() {
        return productoRepository.obtenerProductos();
    }

    public Producto saveProducto(Producto producto) {
        return productoRepository.guardar(producto);
    }

    public String deleteProducto(String nom) {
        productoRepository.eliminar(nom);
        return "Producto eliminado";
    }
}
