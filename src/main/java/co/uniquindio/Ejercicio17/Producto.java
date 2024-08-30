package co.uniquindio.Ejercicio17;

//Clase Producto
public class Producto {

    //Sus atributos
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + ": $" + precio;
    }
}
