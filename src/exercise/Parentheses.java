package exercise;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.Stack;

import java.util.HashMap;
import java.util.Map;

public class Parentheses {
    private final static HashMap<Character, Character> mappings = new HashMap() {{
        put(']', '[');
        put(')', '(');
        put('}', '{');
    }};

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (mappings.containsKey(current)) {
                char topChar = stack.isEmpty() ? ' ' : stack.pop();
                if (topChar != mappings.get(current)) {
                    return false;
                }
            } else {
                stack.push(current);
            }
        }
        return stack.isEmpty();
    }
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == LEFT_PAREN) stack.push(LEFT_PAREN);
//            if (s.charAt(i) == LEFT_BRACE) stack.push(LEFT_BRACE);
//            if (s.charAt(i) == LEFT_BRACKET) stack.push(LEFT_BRACKET);
//
//            if (s.charAt(i) == RIGHT_PAREN) {
//                if (stack.isEmpty()) return false;
//                if (stack.pop() != LEFT_PAREN) return false;
//            } else if (s.charAt(i) == RIGHT_BRACE) {
//                if (stack.isEmpty()) return false;
//                if (stack.pop() != LEFT_BRACE) return false;
//            } else if (s.charAt(i) == RIGHT_BRACKET) {
//                if (stack.isEmpty()) return false;
//                if (stack.pop() != LEFT_BRACKET) return false;
//            }
//        }
//        return stack.isEmpty();
//    }

//    public static void main(String[] args) {
//        String test = "[{()()}]";
//        StdOut.println(isBalanced(test));
//    }

}
