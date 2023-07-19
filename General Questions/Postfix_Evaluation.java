import java.util.*;

public class Postfix_Evaluation {
    public static void main(String[] args) {
        String str = "23+3*";
        Stack<Integer> stack = new Stack<>();
        
        for (char i : str.toCharArray()) {
            if (i == '+' || i == '-' || i == '*' || i == '/') {
                int b = stack.pop();
                int a = stack.pop();
                stack.push(calculate(a, b, i)); // Reversed the order of a and b for correct calculation
            } else {
                stack.push(i - '0');
            }
        }
        System.out.print(stack.pop());
    }
    
    public static int calculate(int a, int b, char op) {
        if (op == '+') return a + b;
        if (op == '-') return a - b; // Changed the order to a - b for correct subtraction
        if (op == '/') return a / b; // Changed the order to a / b for correct division
        else return a * b;
    }
}
