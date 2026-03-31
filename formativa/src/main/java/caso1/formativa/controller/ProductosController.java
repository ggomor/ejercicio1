package caso1.formativa.controller;

import caso1.formativa.service.ProductoService;
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

    @DeleteMapping("{id}")
    public String eliminarProducto(@PathVariable int id) {
        return productoService.deleteProducto(id);
    }


}
