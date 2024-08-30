package co.uniquindio.Ejercicio15;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


//Esta clase filtra los mapas
public class FiltrarMapa {

    public static void main(String[] args) {

        // Crear un mapa que se usa de ejemplo
        Map<String, Integer> mapaOriginal = new HashMap<>();

        mapaOriginal.put("hola", 1);
        mapaOriginal.put("a", 2);
        mapaOriginal.put("todoss", 3);
        mapaOriginal.put("series", 4);
        mapaOriginal.put("pelis", 5);

        // Se filtraa el mapa
        Map<String, Integer> mapaFiltrado = filtrarMapaConMinusculas(mapaOriginal);
        System.out.println(mapaFiltrado); // Debería imprimir: {hola=1, java=3}
    }

    public static Map<String, Integer> filtrarMapaConMinusculas(Map<String, Integer> mapa) {

        // Crear un nuevo mapa para almacenar el resultado
        Map<String, Integer> resultado = new HashMap<>();

        // Convertir el conjunto de entradas del mapa a una lista para permitir la recursión
        Set<Map.Entry<String, Integer>> entradas = mapa.entrySet();

        // Llamar a la función recursiva con el iterador de entradas
        filtrarRecursivo(entradas.iterator(), resultado);
        return resultado;
    }

    private static void filtrarRecursivo(java.util.Iterator<Map.Entry<String, Integer>> iterador,
                                         Map<String, Integer> resultado) {

        // Caso base es si no hay más elementos, terminar
        if (!iterador.hasNext()) {
            return;
        }

        // Obtener la entrada actual
        Map.Entry<String, Integer> entrada = iterador.next();

        //Se consiguen los valores
        String clave = entrada.getKey();
        Integer valor = entrada.getValue();

        // Verificar si la primera letra de la clave es minúscula
        if (!clave.isEmpty() && Character.isLowerCase(clave.charAt(0))) {
            resultado.put(clave, valor);
        }
        // Llamada recursiva con el siguiente elemento
        filtrarRecursivo(iterador, resultado);
    }
}
