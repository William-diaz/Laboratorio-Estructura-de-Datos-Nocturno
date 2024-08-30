package co.uniquindio.Ejercicio16;

import java.util.Stack;

public class Main {

    public static void main(String[] args){

        //Se crea otra pila de prueba
        Stack<String> pilaPrueba = new Stack<>();
        pilaPrueba.push("hola");
        pilaPrueba.push("Barco");
        pilaPrueba.push("amor");
        pilaPrueba.push("Pelicula");
        pilaPrueba.push("helado");
        pilaPrueba.push("Avion");

        //La nueva pila filtrada
        Stack<String> pilaFiltrada = FiltrarPila.filtrarEmpiezaMinuscula(pilaPrueba);

        System.out.println("Elementos de la pila filtrada, los cuales son las palabras que inician en minuscula: " );
        while (!pilaFiltrada.isEmpty()){
            System.out.println(pilaFiltrada.pop());
        }
    }
}
