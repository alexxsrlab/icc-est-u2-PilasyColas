package Ejercicio_01_sing;

import java.util.Stack;

public class SignValidator {

    public static boolean isValid(String texto) {

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {

            char primero = texto.charAt(i);

            if (primero == '(') {
                pila.push(primero);
            } else if (primero == '[') {
                pila.push(primero);
            } else if (primero == '{') {
                pila.push(primero);
            } else {
                if (pila.isEmpty()) {
                    return false;
                }

                char ultimo = pila.pop();

                if (primero == ')' && ultimo != '(') {
                    return false;
                } 
                if (primero == ']' && ultimo != '[') {
                    return false;
                } 
                if (primero == '}' && ultimo != '{') {
                    return false;
                }
            }
        }

        return pila.isEmpty();
    }
}