package co.uniquindio.Ejercicio2;
import java.util.TreeSet;

//Se crea la clase empresa
public class Empresa {

    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {

        productos.add(producto);
    }

    //esta funcion se encarga de buscar el producto con el codigo que se le dé
    public Producto buscarProductosConCodigo(String codigo) {

        for (Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                return producto;
            }
        }
        // Retorna un null si no encuentra el producto
        return null;
    }

    //Funcion que imprime los productos
    public void mostrarProductos() {

        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
