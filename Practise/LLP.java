package Practise;

public class LLP {
    public static class node{
        int data ;
        node next;

        public node(int data1){
            this.data = data1;
        }
    }
    public static void main(String[] args) {
        node a = new node(23);
        node b = new node(34);
        node c = new node(33);
        node d = new node(67);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = null;
        //now in order to print the values of whole linked list we will be using this 
        node temp = a;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}