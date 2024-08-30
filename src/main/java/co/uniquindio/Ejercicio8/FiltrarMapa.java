package co.uniquindio.Ejercicio8;
import java.util.HashMap;
import java.util.Map;

//Esta clase se encarga de filtrar
public class FiltrarMapa {

    // Función recursiva para filtrar entradas con las claves pares
    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa) {

        // Caso base --> si el mapa está vacío, devolver un nuevo mapa vacío
        if (mapa.isEmpty()) {
            return new HashMap<>();
        } else {

            // Crear un nuevo mapa solo para guardar el resultado
            Map<Integer, String> resultado = new HashMap<>();

            // Obtiene la primera entrada del mapa
            Integer primeraClave = mapa.keySet().iterator().next();
            String valorAsociado = mapa.get(primeraClave);

            // Crea un nuevo mapa sin la primera entrada pq ya la obtuvo
            Map<Integer, String> restoDelMapa = new HashMap<>(mapa);
            restoDelMapa.remove(primeraClave);

            // Llamada recursiva con el resto del mapa
            resultado.putAll(filtrarClavesPares(restoDelMapa));

            // Si la clave es par, agregarla al mapa creado al principio llamado resultado
            if (primeraClave % 2 == 0) {
                resultado.put(primeraClave, valorAsociado);
            }

            return resultado;
        }
    }
}

