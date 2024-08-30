package co.uniquindio.Ejercicio16;

import java.util.Stack;

public class FiltrarPila {

    public static Stack<String> filtrarEmpiezaMinuscula(Stack<String> pila){

        //Si esta vacia se acaba
        if (pila.isEmpty()){
            return new Stack<>();
        }else{

            //Obtiene el elemento de arriba de la pila
            String elemento = pila.pop();

            //Llamada recursiva
            Stack<String> resultado = filtrarEmpiezaMinuscula(pila);

            //Comprueba si la primera letra de palabra es minuscula y la manda
            if (Character.isLowerCase(elemento.charAt(0)))
            resultado.push(elemento);

            //Se regresa al la original
            pila.push(elemento);

            return resultado;
        }
    }

}
