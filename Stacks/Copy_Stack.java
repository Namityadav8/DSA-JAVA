package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class Copy_Stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(2);
        st.push(3);
        st.push(46);
        st.push(12);
        // System.out.println("Enter the number of elements you want in Stack :");
        // int n = sc.nextInt();
        // //Taking input in stack using dynamic way using loop
        // for(int i=0;i<n;i++){
        //     System.out.println("Enter the "+(i+1)+" th element :");
        //     int x = sc.nextInt();
        //     st.push(x);
        // }

        // System.out.println(st);
        // now storing the value of one stack into the another in reversed form
        System.out.println(st);
        Stack<Integer> st1 = new Stack<>();
        while(st.size()>0){
            int x = st.peek();
            st1.push(x);
            st.pop();
        }
        Stack<Integer> st2=new Stack<>();
        while(st1.size()>0){
            st2.push(st1.pop());
        }

        System.out.println(st);
        System.out.println(st1);
        System.out.println(st2);
    }
}
