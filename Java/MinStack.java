//Leetcode Number 155

import java.util.ArrayDeque;
import java.util.Deque;

class MinStack {

    private Deque<Integer> stack;
    private Deque<Integer> min;

    public MinStack() {

        stack = new ArrayDeque<>();
        min = new ArrayDeque<>();
        
    }
    
    public void push(int value) {
        
        stack.push(value);

        if (min.isEmpty() || value<=min.peek()){
            min.push(value);
        }
        else{
            min.push(min.peek());
        }

    }
    
    public void pop() {

        stack.pop();
        min.pop();
        
    }
    
    public int top() {

        return stack.peek();
        
    }
    
    public int getMin() {

        return min.peek();
        
    }
}