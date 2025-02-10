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
        //lets delete the bottom first - DownToEarth Person
        System.out.println(st);
        Stack<Integer> temp = new Stack<>();
        while(st.size()>1){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }
        System.out.println(st);
    }
}
