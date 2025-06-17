package Practise;

import java.util.Stack;

public class stackfurther {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st1 = new Stack<>();



        //pushing an element to the bottom of one stack
        st.push(23);
        st.push(25);
        st.push(6);
        st.push(78);
        st.push(98);
        st.push(989);

        while(!st.isEmpty()){
            st1.push(st.pop());
        }
        st.push(6969);
        while(!st1.isEmpty()){
            st.push(st1.pop());
        }

        System.out.println(st);
    }

}
