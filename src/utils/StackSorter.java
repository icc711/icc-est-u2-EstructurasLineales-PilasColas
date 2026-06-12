package utils;
import java.util.Stack;

public class StackSorter { // StackSorter usa un stack usando otro s como auxiliar
    public void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>(); 
        
        while (!stack.isEmpty()) {
            int aux = stack.pop(); // saca el tope del stack original. guarda el elemento que se desea en el lugar correcto.
            
            while (!tempStack.isEmpty() && tempStack.peek() > aux) { 
                // ordena de mayor a menor en el tempStack(Stack temporal), mayor queda en el tope (descendente)
                // mueve los elementos mayores que aux de vuelta al stack original
                stack.push(tempStack.pop()); //stack.push() agrega un elemento de la pila, en el tope. regresa el elemento
            }
            
            tempStack.push(aux); //inserta aux en tempstack. aux queda en la posición correcta.
        }
        
        while (!tempStack.isEmpty()) { // pasa todo devuelta al stack original
            stack.push(tempStack.pop());
        }
    }
    
}
