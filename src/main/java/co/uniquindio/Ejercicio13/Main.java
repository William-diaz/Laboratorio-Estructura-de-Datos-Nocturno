package co.uniquindio.Ejercicio13;
import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Se crea un conjunto de números enteros
        Set<Integer> numeros = new HashSet<>();

        //Se agregan los numeros
        numeros.add(1);
        numeros.add(26);
        numeros.add(33);
        numeros.add(4);
        numeros.add(59);
        numeros.add(6);
        numeros.add(73);
        numeros.add(86);
        numeros.add(9);
        numeros.add(10);

        // Llamar a la función recursiva para filtrar los números pares
        Set<Integer> numerosPares = FiltrarNumeroPares.filtrarPares(numeros);

        // Imprimir el conjunto de números pares
        System.out.println("\nLos numero pares encontrados, son los siguientes: ");
        for (Integer numero : numerosPares) {
            System.out.println(numero);
        }
    }
}
