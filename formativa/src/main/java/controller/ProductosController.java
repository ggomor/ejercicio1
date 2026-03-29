package controller;

import service.ProductoService;
import caso1.formativa.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductosController {

    @Autowired
    private ProductoService productoService;

    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.getProductos();
    }

    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.saveProducto(producto);
    }

    @DeleteMapping("{nom}")
    public String eliminarProducto(@PathVariable String nom) {
        return productoService.deleteProducto(nom);
    }


}
