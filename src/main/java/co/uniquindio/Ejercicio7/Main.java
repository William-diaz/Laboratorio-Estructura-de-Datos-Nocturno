package co.uniquindio.Ejercicio7;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Se crea una lista de personas
        List<Persona> listaPersonas = new ArrayList<>();

        listaPersonas.add(new Persona("Juan", 34));
        listaPersonas.add(new Persona("Lina", 5));
        listaPersonas.add(new Persona("Perdrito", 17));
        listaPersonas.add(new Persona("Maria", 28));
        listaPersonas.add(new Persona("Carlos", 65));

        // Llamar a la función recursiva para obtener solo las personas mayores de edad
        List<Persona> mayoresDeEdad = FiltrarPersonas.filtrarMayoresDeEdad(listaPersonas);

        // Imprimir la lista de personas mayores de edad
        for (Persona persona : mayoresDeEdad) {
            System.out.println(persona);
        }
    }
}
