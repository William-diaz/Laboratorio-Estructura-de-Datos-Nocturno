package co.uniquindio.Ejercicio11;
import java.util.ArrayList;
import java.util.List;

//Esta clase lo ordena con quicksortva los productos
public class QuickSortProductos {

    // Función recursiva para ordenar una lista de productos usando quicksort
    public static List<Producto> quicksort(List<Producto> productos) {

        // Nuestro  caso base es si la lista tiene 0 o 1 elemento significa ya está ordenada
        if (productos.size() <= 1) {
            return productos;
        }

        // Se elige un pivote, empezamos con el primero
        Producto pivote = productos.get(0);

        List<Producto> menores = new ArrayList<>();
        List<Producto> mayores = new ArrayList<>();

        // Dividir la lista en dos listas, una con menores y mayores al pivote
        for (int i = 1; i < productos.size(); i++) {

            Producto actual = productos.get(i);

            if (actual.getValor() < pivote.getValor()) {

                menores.add(actual);

            } else {
                mayores.add(actual);
            }
        }

        // Llamada recursiva y concatenación de resultados
        List<Producto> resultado = new ArrayList<>();

        // Ordenar y agregar los menores
        resultado.addAll(quicksort(menores));

        // Agregar el pivote
        resultado.add(pivote);

        // Ordenar y agregar los mayores
        resultado.addAll(quicksort(mayores));

        return resultado;
    }
}
