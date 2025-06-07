package Stacks;

import java.util.Stack;

public class DIsplayStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(12);

        st.push(10);


        st.push(74);
        st.push(100);

        int n = st.size();
        int a[] = new int[n];
        

        for (int i = 0; i < n; i++) {
            a[i] = st.pop();
        }

        System.out.println("Printing the correct form of the Stack:");
        for (int i = n - 1; i >= 0; i--) {
            st.push(a[i]);
            System.out.print(a[i] + " ");
        }

        System.out.println();
        System.out.println(st);
    }
}


