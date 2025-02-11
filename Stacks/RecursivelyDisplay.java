package Stacks;

import java.util.Stack;

public class RecursivelyDisplay {
    public static void DisplayRec(Stack<Integer> st){
        if(st.size()==0){return ;} // this is our teminating condition
        int x = st.pop();
        // System.out.print(x+" ");
        DisplayRec(st);
        System.out.print(x+" ");
        st.push(x);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(99);
        st.push(47);
        st.push(82);
        st.push(63);
        st.push(420);
        DisplayRec(st); //Reversely printed the elements of Stack 
        System.out.println(st);
    }
}
