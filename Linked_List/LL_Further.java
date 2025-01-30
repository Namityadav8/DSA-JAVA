package Linked_List;

public class LL_Further {
    public static class node{
        int data ;
        node next;

        node (int val){
            this.data = val;
        }
    }

// This is a way to display the linked list using recursive function
    public static void displayr(node head){
        if (head==null){return ;}
        ; // if we call the recurs fun early then it will print it reverse
        displayr(head.next);
        System.out.println(head.data+" ");
    }
    public static void main(String[] args) {
        node a = new node(23);
        node b = new node(10);
        node c = new node(20);
        node d = new node(30);
        node e = new node(40);
        displayr(a);
        //linking to each other
        a.next = b;
        b.next=c;
    }
}
