package caso1.formativa.repository;

import caso1.formativa.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {

    // lista(arreglo) que guarda en una "base de datos" local los productos
    // ingresados en la cesion
    private List<Producto> listaProducto = new ArrayList<>();

    // metodo que retorna la lista de productos
    public List<Producto> obtenerProductos() {
        return listaProducto;
    }

    public Producto guardar(Producto pro) { 
        listaProducto.add(pro);
        return pro;
    }

    public void eliminar(int id) { 

        listaProducto.removeIf(x -> x.getId() == id);
    }
}
