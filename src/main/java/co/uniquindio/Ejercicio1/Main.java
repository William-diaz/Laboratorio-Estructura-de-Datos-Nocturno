package co.uniquindio.Ejercicio1;
import java.util.ArrayList;
import java.util.Collections;

//Clase Main
public class Main {

    public static void main(String[] args) {

        // Crea la lista de Personas
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Persona("Pedrito", 25, "M"));
        lista.add(new Persona("Ronaldo :)", 30, "M"));
        lista.add(new Persona("Maria", 22, "F"));
        lista.add(new Persona("Sofiaa", 95, "F"));

        // Ordena la lista
        Collections.sort(lista);

        //Imprime la lista
        System.out.println(lista);
    }
}
