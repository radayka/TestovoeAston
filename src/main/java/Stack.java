import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Stack {

    public static void main(String[] args) {
        System.out.println(isValid("[((()))()(())]")); // лишняя ']' в конце или не хватает '[' в начале ;
                                                          // не хватает ')' после первых трёх '(' или лишняя '(' в начале.
    }

    private static boolean isValid(String st) {
        Map<Character, Character> sym = new HashMap<>();
        sym.put(')', '(');
        sym.put(']', '[');
        Deque<Character> stack = new LinkedList<>();
        for (Character c : st.toCharArray()) {
            if (sym.containsValue(c)) {
                stack.push(c);
            } else if (sym.containsKey(c)) {
                if (stack.isEmpty() || stack.pop() !=sym.get(c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}
