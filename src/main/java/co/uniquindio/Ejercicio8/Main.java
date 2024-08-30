package co.uniquindio.Ejercicio8;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Se crea un mapa como ejemplo
        Map<Integer, String> mapaEjemplo = new HashMap<>();
        mapaEjemplo.put(1, "Uno");
        mapaEjemplo.put(2, "Dos");
        mapaEjemplo.put(3, "Tres");
        mapaEjemplo.put(4, "Cuatro");
        mapaEjemplo.put(6, "seis");
        mapaEjemplo.put(11, "once");

        // Se llama a la función recursiva para filtrar las claves pares
        Map<Integer, String> mapaFiltrado = FiltrarMapa.filtrarClavesPares(mapaEjemplo);

        // Ahora se imprime el mapa ya filtrado
        for (Map.Entry<Integer, String> entrada : mapaFiltrado.entrySet()) {
            System.out.println("Clave: " + entrada.getKey() + ", Valor: " + entrada.getValue());
        }
    }
}
