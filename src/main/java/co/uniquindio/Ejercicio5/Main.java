package co.uniquindio.Ejercicio5;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        // Se crea un HashSet para almacenar elementos sin que hayan duplicados
        Set<String> elementos = new HashSet<>();

        // Se agregan algunos elementos al HashSet
        elementos.add("Manzana");
        elementos.add("Perro");
        elementos.add("Celular");
        elementos.add("Pastel");

        // Celular esta duplicado, asi que no no se agregará
        elementos.add("Celular");


        // Se crea un iterador para recorrer los elementos del HashSet
        Iterator<String> iterador = elementos.iterator();

        // Se imprime el contenido del HashSet usando el iterador
        while (iterador.hasNext()) {
            String elemento = iterador.next();
            System.out.println(elemento);
        }
    }
}

