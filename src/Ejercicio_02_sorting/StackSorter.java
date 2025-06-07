package Ejercicio_02_sorting;

import java.util.Stack;

public class StackSorter {
    
    public static void sortStack (Stack<Integer> pila) {
        
        Stack<Integer> pilaOrdenada = new Stack<>();

        while (!pila.isEmpty()) {
            int numeroActual = pila.pop();

            while (!pilaOrdenada.isEmpty() && pilaOrdenada.peek() < numeroActual) {
                pila.push(pilaOrdenada.pop());
            }

            pilaOrdenada.push(numeroActual);
        }

        while (!pilaOrdenada.isEmpty()) {
            pila.push(pilaOrdenada.pop());
        }
    }
}
