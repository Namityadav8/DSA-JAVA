package Linked_List;

public class DoubleLinkedList {

    public static class node{
        int val ;
        node next;
        node pvs; 

        public node(int data){
            this.val=data;
        }
    }
    // this is basically printing the values as from the front
    public static void display(node head){
        node temp = head;
        while(temp!=null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    //now printing values from tailusing pvs pointer
    public static void displayrev(node head){
        node temp = head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp=temp.pvs;
        }
    }



    public static void main(String[] args) {
        node a = new node(12);
        node b = new node(15);
        node c = new node(26);
        node d = new node(30);
        a.pvs=null;
        a.next=b;
        b.next=c;
        b.pvs=a;
        c.next=d;
        c.pvs=b;
        d.next=null;
        d.pvs=c;
        display(a);
        System.out.println("Now Printing from the end");
        displayrev(d);
    }
}
