import java.util.Stack;

public class st4ck {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("BMW");
        stack.push("Corvette");
        stack.push("Lambo");

        System.out.println("peek: " + stack.peek());
        System.out.println("pop: " + stack.pop());

        stack.push("Toyota Camry");
        System.out.println("peek: " + stack.peek());

    }
}
