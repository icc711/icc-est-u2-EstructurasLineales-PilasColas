package utils;

import java.util.Deque; // deque es una cola doble, permite sacar tanto del frente como del final
import java.util.LinkedList;

public class QueuePalindrome {
    
    public boolean isPalindrome(String text){
        Deque <Character> queue= new LinkedList<>(); 
        // Crea una lista donde se van a guardar los 
        // caracteres uno por uno

        for (char c : text.toCharArray()){ 
            // Convierte un string en un arreglo de chars y 
            // agrega cada caracter al final de la cola creada
            queue.addLast(c);
        }
        while (queue.size() > 1) { 
            // para cuando quede 0 - 1 carácter. 
            // Si queda 1, 
            // es el carácter del medio entonces no se compara con ninguno.
            char first = queue.removeFirst(); // saca del frente
            char last = queue.removeLast(); // saca del final

            if (first != last){ 
                // si el inicio y final no coinciden, devuelve 
                // falso y no será considerado palíndromo 
                return false;
            }
        }
        return true; 
        // si la palabra coincide(palíndromo), devuelve verdadero
    }
}
