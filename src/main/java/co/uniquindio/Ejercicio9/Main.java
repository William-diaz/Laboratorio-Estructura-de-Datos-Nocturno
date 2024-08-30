package co.uniquindio.Ejercicio9;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        // Se crea una pila de ejemplo
        Stack<Integer> pilaEjemplo = new Stack<>();

        pilaEjemplo.push(13);
        pilaEjemplo.push(2);
        pilaEjemplo.push(6);
        pilaEjemplo.push(4);
        pilaEjemplo.push(22);
        pilaEjemplo.push(7);

        // Se llama a la función recursiva para filtrar los elementos que sean mayores que 5
        Stack<Integer> pilaFiltrada = FiltrarPila.filtrarMayoresQueCinco(pilaEjemplo);

        // Por ultimo se imprime la pila filtrada
        System.out.println("Elementos de la pila filtrada, los cuales son mayores a 5: ");
        while (!pilaFiltrada.isEmpty()) {
            System.out.println(pilaFiltrada.pop());
        }
    }
}
