package praxis.cl;

import java.util.ArrayList;
import java.util.List;

public class ProductoServicio {
   private  Producto producto= new  Producto();
   private List<Producto> listaProductos=new ArrayList<>();

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }
}
