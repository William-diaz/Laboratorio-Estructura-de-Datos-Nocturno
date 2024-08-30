package co.uniquindio.Ejercicio17;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapasDeProductos {

    public static void main(String[] args) {

        // Se crean y se llena el HashMap
        Map<String, Producto> hashMap = new HashMap<>();
        hashMap.put("C", new Producto("fresa", 3.99));
        hashMap.put("A", new Producto("Frambueza", 2.49));
        hashMap.put("B", new Producto("Mora", 5.99));

        //----------------------------------------------------------------------------------------------------//

        // Crear y llenar LinkedHashMap
        Map<String, Producto> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("C", new Producto("fresa", 3.99));
        linkedHashMap.put("A", new Producto("Frambueza", 2.49));
        linkedHashMap.put("B", new Producto("Mora", 5.99));

        //----------------------------------------------------------------------------------------------------//

        // Crear y llenar TreeMap
        Map<String, Producto> treeMap = new TreeMap<>();
        treeMap.put("C", new Producto("fresa", 3.99));
        treeMap.put("A", new Producto("frambueza", 2.49));
        treeMap.put("B", new Producto("Mora", 5.99));

        //----------------------------------------------------------------------------------------------------//

        // Mostrar los resultados

        System.out.println("Usando el HashMap, este no garantiza ningun orden: " );
        for (Map.Entry<String, Producto> entrada : hashMap.entrySet()) {
            System.out.println(entrada.getKey() + " => " + entrada.getValue());
        }

        //----------------------------------------------------------------------------------------------------//

        System.out.println("\nUsando LinkedHashMap ,este se ordena de acuerdo a la insercion de los productos:");
        for (Map.Entry<String, Producto> entrada : linkedHashMap.entrySet()) {
            System.out.println(entrada.getKey() + " => " + entrada.getValue());
        }

        //----------------------------------------------------------------------------------------------------//

        System.out.println("\nUsando el TreeMap, este se ordena en orden alfabeticon de las claves");
        for (Map.Entry<String, Producto> entrada : treeMap.entrySet()) {
            System.out.println(entrada.getKey() + " => " + entrada.getValue());
        }

        //----------------------------------------------------------------------------------------------------//
    }
}
