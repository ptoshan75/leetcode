//Leetcode Number 20

import java.util.ArrayDeque;
import java.util.Deque;

class ValidParenthesis {
    public boolean isValid(String s) {

        if (s.length()<=1){
            return false;
        }
        
        char[] arr = s.toCharArray();
        //ArrayList<Character> stack = new ArrayList<>();
        Deque<Character> stack = new ArrayDeque<>();
        int top = -1;

        for (char c : arr){

            if (c=='(' || c=='[' || c=='{'){
                stack.push(c);
                top++;
            }
            else if (top>=0 && c==')' && stack.peek()=='('){
                stack.pop();
                top--;
            }
            else if (top>=0 && c==']' && stack.peek()=='['){
                stack.pop();
                top--;
            }
            else if (top>=0 && c=='}' && stack.peek()=='{'){
                stack.pop();
                top--;
            }
            else{
                return false;
            }

        }

        return top==-1;

    }
}