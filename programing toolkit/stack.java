import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // push element
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println(stack);

        // pop elements
        stack.pop();
        System.out.println(stack);

    }
}
