package co.uniquindio.Ejercicio12;
import java.util.ArrayList;
import java.util.List;

//Se crea la clase del arbol
public class ArbolBinarioBusqueda {

    Nodo raiz;

    // Constructor
    public ArbolBinarioBusqueda() {
        this.raiz = null;
    }

    // Método para insertar un valor en el árbol
    public void insertar(int valor) {
        raiz = insertarRecursivo(raiz, valor);
    }

    private Nodo insertarRecursivo(Nodo nodo, int valor) {
        if (nodo == null) {
            return new Nodo(valor);
        }
        if (valor < nodo.valor) {
            nodo.izquierdo = insertarRecursivo(nodo.izquierdo, valor);
        } else if (valor > nodo.valor) {
            nodo.derecho = insertarRecursivo(nodo.derecho, valor);
        }
        return nodo;
    }

    // Función recursiva para obtener los elementos en orden ascendente
    public List<Integer> obtenerElementosEnOrden() {
        List<Integer> elementos = new ArrayList<>();
        obtenerElementosEnOrdenRecursivo(raiz, elementos);
        return elementos;
    }

    private void obtenerElementosEnOrdenRecursivo(Nodo nodo, List<Integer> elementos) {
        if (nodo != null) {
            // Primero, recorrer el subárbol izquierdo
            obtenerElementosEnOrdenRecursivo(nodo.izquierdo, elementos);
            // Luego, agregar el valor del nodo actual
            elementos.add(nodo.valor);
            // Finalmente, recorrer el subárbol derecho
            obtenerElementosEnOrdenRecursivo(nodo.derecho, elementos);
        }
    }
}

