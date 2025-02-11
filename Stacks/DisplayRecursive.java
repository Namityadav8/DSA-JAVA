package Stacks;

import java.util.Stack;

public class DisplayRecursive {
    public static void pushAtBottom(Stack<Integer> st , int top){
        
        Stack<Integer> temp = new Stack<>();
        int idx = 0;
        
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(top);
        while(temp.size()>0){
            st.push(temp.pop());
        }

        System.out.println(st);
        
    }
    public static void reversestack(Stack<Integer> st){
        if(st.size()==1){return ;}
        int top = st.pop();
        reversestack(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(2);
        st.push(9);
        st.push(3);
        st.push(10);
        System.out.println(st);
        reversestack(st);
        //NORMAL WAY 

        // Stack<Integer> rt = new Stack<>();
        // Stack<Integer> qt = new Stack<>();
        // while(st.size()>0){
        //     rt.push(st.pop());
        // }
        // System.out.println(rt);
        // while(rt.size()>0){
        //     qt.push(rt.pop());
        // }
        // System.out.println(qt);
        // // now printing the reverse of the st stack 
        // while(qt.size()>0){
        //     st.push(qt.pop());
        // }
        // System.out.println(st);
    }
}
