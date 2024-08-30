package co.uniquindio.Ejercicio13;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Esta clase filtra los numeros paress
public class FiltrarNumeroPares {

    // Funcion recursiva para filtrar números pares
    public static Set<Integer> filtrarPares(Set<Integer> numeros) {

        // Aqui el caso base es si el conjunto está vacío, devolver un nuevo conjunto vacío
        if (numeros.isEmpty()) {
            return new HashSet<>();
        }

        // Crea un iterador para recorrer el conjunto
        Iterator<Integer> iterator = numeros.iterator();

        // Obtener un elemento del conjunto
        Integer numero = iterator.next();

        // Eliminar el elemento actual para no procesarlo de nuevo
        iterator.remove();

        // Llamada recursiva con el resto del conjunto
        Set<Integer> pares = filtrarPares(numeros);

        // Si el número es par, añadirlo al conjunto de pares
        if (numero % 2 == 0) {
            pares.add(numero);
        }

        return pares;
    }
}

