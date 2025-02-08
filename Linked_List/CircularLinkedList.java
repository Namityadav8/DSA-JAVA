package Linked_List;

public class CircularLinkedList {
    public static class node{
        int val ;
        node next;
        node pvs;

        public node(int val){
            this.val=val;
        }
    }
    public static void main(String[] args) {
         node a = new node(12);
         node b = new node(56);
         node c = new node(47);
         node d = new node(99);
         node e = new node(13);
         a.next=b;
         b.next=c;
         b.pvs=a;
         c.next=d;
         c.pvs=b;
         d.pvs=c;
         d.next=e;
         e.next=a;
         a.pvs=e;
         node temp = a;
         temp=temp.next;
         System.out.println(a.val);
         while(temp!=a){
            System.out.println(temp.val);
            temp=temp.next;
         }

    }
}
