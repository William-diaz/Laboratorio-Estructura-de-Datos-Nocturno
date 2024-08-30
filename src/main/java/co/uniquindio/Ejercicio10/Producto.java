package co.uniquindio.Ejercicio10;

// Producto.java
public class Producto {
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
        return "Producto: " + nombre + ", Valor: " + valor;
    }
}

