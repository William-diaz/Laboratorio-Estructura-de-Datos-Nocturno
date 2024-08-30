package co.uniquindio.Ejercicio4;

public class Main {

    public static void main(String[] args) {

        Pila pila = new Pila();

        // Se agrega un String, palabra cualquiera
        pila.push("Gatos");

        // Se agrega otro String que si se permite
        pila.push("Helado");

        pila.push("Avion");

        // Da error ya que no se pude poner 123 si no es un string
        pila.push(123);

        // Se quita "helado"
        pila.pop();


        System.out.println("La cima de la pila es: " + pila.peek());
    }
}


