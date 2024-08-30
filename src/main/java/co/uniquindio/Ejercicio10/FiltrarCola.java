package co.uniquindio.Ejercicio10;
import java.util.LinkedList;
import java.util.Queue;

//Esta clase filtra la cola
public class FiltrarCola {

    // Función recursiva para filtrar elementos de la cola que cumplan la condición
    public static Queue<Producto> filtrarMenoresQueCienMil(Queue<Producto> cola) {

        // El caso base es si la cola está vacía, devolver una nueva cola vacía
        if (cola.isEmpty()) {
            return new LinkedList<>();

        } else {
            // Obtener el primer elemento de la cola
            Producto producto = cola.poll();

            // Llamada recursiva con el resto de la cola
            Queue<Producto> resultado = filtrarMenoresQueCienMil(cola);

            // Si el producto cumple con la condición, agregarlo a la cola resultado
            if (producto.getValor() < 100000) {
                resultado.add(producto);
            }

            cola.add(producto);

            return resultado;
        }
    }
}

