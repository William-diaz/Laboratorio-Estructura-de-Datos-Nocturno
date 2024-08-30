package co.uniquindio.Ejercicio9;
import java.util.Stack;

//clase que se encarga de filtrar la pilaa
public class FiltrarPila {

    // Función recursiva para filtrar elementos de la pila que cumplan la condición
    public static Stack<Integer> filtrarMayoresQueCinco(Stack<Integer> pila) {

        // Caso base, si la pila está vacía, devuelve una nueva pila pero vacía
        if (pila.isEmpty()) {
            return new Stack<>();
        } else {

            // Obtener el elemento superior de la pila
            Integer elemento = pila.pop();

            // Llamada recursiva con el resto de la pila
            Stack<Integer> resultado = filtrarMayoresQueCinco(pila);

            // Si el elemento cumple con la condición agregarlo a la pila resultado
            if (elemento > 5) {
                resultado.push(elemento);
            }

            // Regresar el elemento a la pila original para mantener su estado
            pila.push(elemento);

            return resultado;
        }
    }
}

