package Linked_List;
import java.util.*;


public class LL1 {
    public static class node{
        int data ;
        node next;

        node(int dataa){
            this.data = dataa;
        }
    }
    public static void main(String args[]){
        node a = new node(3);
        node b = new node(2);        
        node c = new node(5);
        
        a.next=b;  // a is linked to b  b's address gets stored in the address variable of a node
        b.next=c;  // b is linked to c 
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        System.out.println(a.next);
        System.out.println(b);



        //displaying the values of the linked list if head is given
        // System.out.println("Displaying the linked list :");
        // node temp = a ;
        // for(int i=1;i<=3;i++){
        //     System.out.print(temp.data +" ");
        //     temp = temp.next;
        // }


        System.out.println("Displaying LL without knowing the length of it ");
        node temp=a;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }


        
        
    }
}
