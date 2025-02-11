package Stacks;
import java.util.Stack;

public class DeletionInsertion {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        
        st.push(34);
        st.push(2);
        st.push(3);
        st.push(99);
        st.push(60);

        System.out.println("Original Stack: " + st);

        removeBottomElement(st);

        System.out.println("Stack after removing the bottom element: " + st);
    }

    public static void removeBottomElement(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();

        while (st.size() > 1) {
            temp.push(st.pop());
        }

        if (!st.isEmpty()) {
            st.pop();
        }

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
}
