package co.uniquindio.Ejercicio7;
import java.util.ArrayList;
import java.util.List;

//Clase que se encarga de filtrar
public class FiltrarPersonas {

    // Función recursiva para filtrar a las personas mayores de edad
    public static List<Persona> filtrarMayoresDeEdad(List<Persona> personas) {

        // El caso base es si la lista está vacía, devuelve una lista vacía
        if (personas.isEmpty()) {
            return new ArrayList<>();

        } else {
            // Consigue la primera persona de la lista
            Persona primeraPersona = personas.get(0);
            // Crea una nueva lista eliminando la primera persona
            List<Persona> restoDePersonas = personas.subList(1, personas.size());
            // Llama recursivamente a la función con el resto de personas
            List<Persona> resultado = filtrarMayoresDeEdad(restoDePersonas);

            // Si la primera persona es mayor de edad, agregarla a la lista resultado
            if (primeraPersona.getEdad() >= 18) {
                resultado.add(0, primeraPersona);
            }
            return resultado;
        }
    }
}
