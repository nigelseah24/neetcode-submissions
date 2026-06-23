class MinStack {

    private final ArrayDeque<Integer> stack;
    private final ArrayDeque<Integer> minStack;

    public MinStack() {
        this.stack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if (minStack.isEmpty()) {
            minStack.push(val);
        } else {
            int minimum = Math.min(minStack.peek(), val);
            minStack.push(minimum);
        }
        stack.push(val);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
