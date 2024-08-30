package co.uniquindio.Ejercicio2;
// Clase para producto
public class Producto implements Comparable<Producto> {

    //Atributos
    private String codigo;
    private String nombre;
    private int precio;

    public Producto(String codigo, String nombre, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    // Esta funcion se encarga de ordenar por el código
    @Override
    public int compareTo(Producto producto2) {
        return this.codigo.compareTo(producto2.codigo);
    }

    @Override
    public String toString() {
        return "Caracteristicas del producto: " +
                "codigo = " + codigo +
                ", nombre = " + nombre +
                ", precio = " + precio + "\n";
    }
}


