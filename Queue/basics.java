package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class basics {
    public static void main(String[] args) {
        Queue<Integer> st = new LinkedList<>();
        st.add(23);
        st.add(22);
        st.add(25);
        st.add(28);
        st.add(2);
        st.offer(1);
        System.out.println(st);
        st.remove();
        System.out.println(st.peek());
        System.out.println(st);
    }
}
