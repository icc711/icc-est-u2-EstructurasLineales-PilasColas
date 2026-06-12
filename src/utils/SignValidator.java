package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>(); 
        // stack funciona como LIFO(LAST IN, First OUT)

        for (char c : s.toCharArray()) { 
            // recorre cada carácter del string 
            if(c == '(' || c == '[' || c == '{'){ 
                // si la estructura es así, se apila
                stack.push(c);
            
            } else if (c == ')' || c == ']' || c == '}') { 
                // comprueba que estos sean signos de cierre
                
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop(); 
                // saca el último signo abierto
                // se verifica que al cerrar, los signos 
                // corresponden el orden con los que se abrio
                if (c == ')' && top != '(' ) 
                    return false; 
                if (c == ']' && top != '[' )
                    return false; 
                if (c == '}' && top != '{' ) {
                    return false;
                }
            }
        }
        return stack.isEmpty(); 
        // returna true si los signos se cerraron correctamente
    }    
}
