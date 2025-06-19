package Day11;

import java.util.Stack;

//stack
// Remove Adjacent Duplicates
// Problem: Remove adjacent duplicate characters in a string using stack.
//  Input: "abbaca"
//  Output: "ca"




public class RemoveAdjecentDuplicate {
    public static void main(String[] args) {
        String input = "abbaca";
        Stack<Character> st = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (!st.isEmpty() && st.peek() == ch) {
                st.pop(); // remove the duplicate
            } else {
                st.push(ch); // add to stack
            }
        }

        // Now build the final result from stack
        StringBuilder result = new StringBuilder();
        for (char ch : st) {
            result.append(ch);
        }

        System.out.println("Output: " + result.toString());  // Output: ca
    }
}


