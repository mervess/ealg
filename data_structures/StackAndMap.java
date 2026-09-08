import java.util.Stack;
import java.util.Map;
import java.util.HashMap;

/**
 * This class demonstrates the use of Java's Stack and Map data structures.
 */

public class StackAndMap
{
    static void testStack()
    {
        Stack<String> stack = new Stack<>();
        stack.push("A");
        stack.push("B");
        stack.push("C");

        System.out.println("Stack contents (top to bottom):"); // Top is the last element pushed onto the stack
        System.out.println("[");
        while (!stack.isEmpty())
        {
            System.out.println("  " + stack.pop());
        }
        System.out.println("]\n");
    }

    static void testMap()
    {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);
        map.put("B", 22); // Overwrites the previous value for key "B"

        System.out.println("Map contents:");
        System.out.println("{");
        for (String key : map.keySet())
        {
            System.out.println("  " + key + " => " + map.get(key));
        }
        System.out.println("}");
    }

    public static void main(String[] args)
    {
        // Java's Stack structure
        testStack();
        // Java's "Map" structure in the form of HashMap; equaivalent to Python's dictionary
        testMap();
    }   
}
