import java.util.Stack;

public class LernStack {
    public static void main(String[] args) {
        Stack <String> animals = new Stack <>();

        animals.push("dog");
        animals.push("cat");
        animals.push("lion");   // here push function is used to insert the element in stack
        animals.push("tiger");

        System.out.println("Stack: " + animals);

        System.out.println(animals.pop());  // pop function is used to remove the element from the stack

        System.out.println(animals);

        System.out.println(animals.peek()); // here peek is used to show the top most element in the stack
    }
}
