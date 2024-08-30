package co.uniquindio.Ejercicio11;

//Se crea la clase
public class Producto {

    //Atributos
    private String nombre;
    private int valor;

    // Constructor
    public Producto(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    // Método para obtener el valor del producto
    public double getValor() {
        return valor;
    }

    // Método para representar el producto como cadena de texto
    @Override
    public String toString() {
        return "El Producto es: " + nombre + "y el Valor: " + valor;
    }
}
