package Day11;

import java.util.Stack;

pimport java.util.Stack;

public class SimpleSortStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(1);
        stack.push(2);

        Stack<Integer> tempStack = new Stack<>();

        while (!stack.isEmpty()) {
            int temp = stack.pop();

            while (!tempStack.isEmpty() && tempStack.peek() > temp) {
                stack.push(tempStack.pop());
            }

            tempStack.push(temp);
        }

        // Print sorted stack
        while (!tempStack.isEmpty()) {
            System.out.print(tempStack.pop() + " ");
        }
    }
}
