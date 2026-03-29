package repository;

import caso1.formativa.model.Producto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductoRepository {

    // lista(arreglo) que guarda en una "base de datos" local los productos
    // ingresados en la cesion
    private List<Producto> listaProductos = new ArrayList<>();

    // metodo que retorna la lista de productos
    public List<Producto> obtenerProductos() {
        return listaProductos;
    }

    public Producto guardar(Producto pro) { 
        listaProductos.add(pro);
        return pro;
    }

    public void eliminar(String nom) { 

        listaProductos.removeIf(x -> x.getNombre() == nom);
    }
}
