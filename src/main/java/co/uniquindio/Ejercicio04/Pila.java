package co.uniquindio.Ejercicio4;
import java.util.Stack;

public class Pila {

    // Se crea la pila
    private Stack<Object> stack = new Stack<>(); 

    // Con este metodo se puede agregar un elemento a la pila
    public void push(Object objeto) {
        
        if (stack.isEmpty() || stack.peek().getClass().equals(objeto.getClass())) {
            stack.push(objeto);
            System.out.println("El elemnto agregado es: " + objeto);
        } else {
            System.out.println("Error, el tipo de dato no coincide con el de la cima de la pila.");
        }
    }

    // Este metodo quita el elemento en la cima de la pila
    public Object pop() {
        return stack.pop();
    }

    // Este metodo ve el elemento de la cima de la pila pero sin quitarlo
    public Object peek() {
        return stack.peek();
    }

    // este metodo verifica si la pila está vacía
    public boolean isEmpty() {
        return stack.isEmpty();
    }
}
