package Stacks;

import java.util.Stack;

public class InsertionStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(3);
        st.push(45);
        st.push(64);
        st.push(20);
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        int idx = 0;
        int val = 69;
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
