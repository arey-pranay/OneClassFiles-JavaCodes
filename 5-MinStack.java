import java.util.Stack;

public class Main {
    static class MinStack {
        private Stack<Integer> stack;
        private Stack<Integer> minStack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek()) {
                minStack.push(val);
            }
        }

        public void pop() {
            if (!stack.isEmpty()) {
                if (stack.peek().equals(minStack.peek())) {
                    minStack.pop();
                }
                stack.pop();
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(3);
        minStack.pop();
        minStack.push(4);
        minStack.push(-1);
        minStack.top();
        minStack.push(6);
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        System.out.println("Current Min: " + minStack.getMin());
    }
}
