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

    //Now printing the complete LL given any random node 
    public static void displayrandom(node random){
        node temp = random;
        while(temp.pvs!=null){
            temp=temp.pvs;
        }

        //Now temp at head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }

    //Insertion at head
    public static node inserthead(node head,int val){
        node t = new node(val);
        t.next=head;
        head.pvs=t;
        head=t;
        return head;
        
    }

    //inserting a new element at the tail of the DLL
    public static void insertAttail(node head,int x){
        node temp = head;
        while(temp.next!=null){
            temp=temp.next;
        }
        node t = new node(x);
        temp.next=t;
        t.pvs=temp;
    }


    //Insert At any index 
    public static void insertAtrandom(node head,int idx , int value){
        node temp= head;
        for(int i=1;i<=idx-1;i++){
            temp=temp.next;
        }
        node r = temp.next;
        node t = new node(value);
        temp.next = t;
        t.pvs=temp;
        t.next=r;
        r.pvs=t;
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
        // display(a);
        // System.out.println("Now Printing from the end");
        // displayrev(d);
        // System.out.println("Now printing the complete LL given any random node");
        // displayrandom(b);
        // node newnode = inserthead(a, 69);
        // display(newnode);
        // insertAttail(a, 99);
        // display(a);
        insertAtrandom(a, 2, 100);
        display(a);
    }
}
