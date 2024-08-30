package co.uniquindio.Ejercicio2;

public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        // Se añaden los productos
        empresa.agregarProducto(new Producto("0156", "Nintendo", 1200000));
        empresa.agregarProducto(new Producto("0250", "Estuche", 40000));
        empresa.agregarProducto(new Producto("0357", "Control", 100000));

        // Se muestran todos los productos
        empresa.mostrarProductos();

        // Con esto se busca un producto por su código
        Producto productoBuscado = empresa.buscarProductosConCodigo("0156");

        if (productoBuscado != null) {
            System.out.println("\nEl producto ha sido encontrado: " + productoBuscado);
        } else {
            System.out.println("El Producto no ha sido encontrado.");
        }
    }
}
