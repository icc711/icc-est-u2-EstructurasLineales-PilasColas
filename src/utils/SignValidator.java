package utils;

import java.util.Stack;

public class SignValidator {
    public boolean isValid(String st) {
        Stack<Character> stack = new Stack<>(); //stack funciona como LIFO(First IN, First OUT)

        for (char c : st.toCharArray()) { // recorre cada carácter del string 
            if(c == '(' || c == '[' || c == '{'){ // si la estructura es así, se apila
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop(); // saca el último 
                if (c == ')' && top != '(' ) 
                    return false; 
                if (c == ']' && top != '[' )
                    return false; 
                if (c == '}' && top != '{' ) {
                    return false;
                }
            }
            return stack.isEmpty();
        }
        
    }    
}
