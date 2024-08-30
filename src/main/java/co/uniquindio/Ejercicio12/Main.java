package co.uniquindio.Ejercicio12;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Se crea un arbol de busqueda binaria

        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();

        //Se le insertan valores cualquiera
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(70);
        arbol.insertar(100);
        arbol.insertar(10);
        arbol.insertar(60);
        arbol.insertar(80);

        // Obtener los elementos pero de orden ascendente
        List<Integer> elementosEnOrden = arbol.obtenerElementosEnOrden();

        // Imprimir los elementos en orden ascendente
        System.out.println("Los elementos del árbol en orden ascendente son:");
        for (int valor : elementosEnOrden) {
            System.out.println(valor);
        }
    }
}
