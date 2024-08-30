package co.uniquindio.Ejercicio10;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Crear una cola de productos
        Queue<Producto> colaProductos = new LinkedList<>();

        //Se agregan los productos
        colaProductos.add(new Producto("Carro", 50000000));
        colaProductos.add(new Producto("gafas", 400000));
        colaProductos.add(new Producto("pantalon", 70000));
        colaProductos.add(new Producto("hamburguesa :D", 15000));
        colaProductos.add(new Producto("maleta", 80000));

        // Llamar a la función recursiva para filtrar los productos con valor menor que 10
        Queue<Producto> colaFiltrada = FiltrarCola.filtrarMenoresQueCienMil(colaProductos);

        // Imprimir la cola filtrada
        System.out.println("Los productos que tienen un valor menosr a 100,000$, son:");
        for (Producto producto : colaFiltrada) {
            System.out.println(producto);
        }
    }
}
