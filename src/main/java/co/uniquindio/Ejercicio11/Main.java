package co.uniquindio.Ejercicio11;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Crear una lista de productos
        List<Producto> listaProductos = new ArrayList<>();
        listaProductos.add(new Producto("Pc Gamer", 5000000));
        listaProductos.add(new Producto("Audifonos", 300000));
        listaProductos.add(new Producto("Pizza", 30000));
        listaProductos.add(new Producto("Saco", 80000));
        listaProductos.add(new Producto("Boorador xD", 1000));

        // esto ordena la lista de productos usando el quicksort
        List<Producto> productosOrdenados = QuickSortProductos.quicksort(listaProductos);

        // Ahora se imprimen la lista de productos ordenados
        System.out.println("\nLos productos ordenados de acuerdo a su valor, son:");

        for (Producto producto : productosOrdenados) {
            System.out.println(producto);
        }
    }
}
