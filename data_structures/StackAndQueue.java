import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueue
{
    static void testStack()
    {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("[");
        while (!stack.isEmpty())
        {
            System.out.println("  " + stack.pop());
        }
        System.out.println("]");
    }

    static void testQueue()
    {
        Queue<String> queue = new ArrayDeque<>(3);
        queue.add("A");
        queue.add("B");
        queue.add("C");

        System.out.println("<<");
        while (!queue.isEmpty())
        {
            System.out.println("  " + queue.poll());
        }
        System.out.println(">>");
    }

    public static void main(String[] args)
    {
        testStack();
        testQueue();
    }   
}
