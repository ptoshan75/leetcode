//Leetcode Number 150

import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] tokens) {
        
        Deque<Integer> stack = new ArrayDeque<>();

        for (String t : tokens){

            if (t.equals("+")){
                stack.push(stack.pop() + stack.pop());
            }
            else if(t.equals("-")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
            }
            else if(t.equals("*")){
                stack.push(stack.pop() * stack.pop());
            }
            else if(t.equals("/")){
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a/b);
            }
            else{
                stack.push(Integer.parseInt(t));
            }
        }

        return stack.peek();

    }
}
