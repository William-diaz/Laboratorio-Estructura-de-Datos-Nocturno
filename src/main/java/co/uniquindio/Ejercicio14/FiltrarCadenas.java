package co.uniquindio.Ejercicio14;
import java.util.ArrayList;
import java.util.List;

//Clase que filtra cadenas de Strings
public class FiltrarCadenas {

    public static void main(String[] args) {

        List<String> cadenas = List.of("Hola", "java", "Estructuras", "sol", "Datos", "adios");
        List<String> resultado = filtrarCadenasConMayusculas(cadenas);

        // Debería imprimir --> "Hola, Estructuras, Datos"
        System.out.println(resultado);
    }

    public static List<String> filtrarCadenasConMayusculas (List<String> cadenas) {

        // Crea una lista vacía para almacenar el resultado
        List<String> resultado = new ArrayList<>();

        // Llama a la función recursiva con el índice inicial
        filtrarRecursivo(cadenas, 0, resultado);
        return resultado;
    }

    //Funcion para filtrar de manera recursiva
    private static void filtrarRecursivo(List<String> cadenas, int indice, List<String> resultado) {

        // Caso base --> si el índice es igual al tamaño de la lista ya acabamos
        if (indice >= cadenas.size()) {
            return;
        }
        // Obtener la cadena actual
        String cadena = cadenas.get(indice);

        // Verificar si la primera letra es mayúscula
        if (!cadena.isEmpty() && Character.isUpperCase(cadena.charAt(0))) {
            resultado.add(cadena);
        }
        // Llamada recursiva con el siguiente índice
        filtrarRecursivo(cadenas, indice + 1, resultado);
    }
}

