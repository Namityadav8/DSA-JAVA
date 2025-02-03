package Linked_List;

public class lengthLL {
    public static class node{
        int data;
        node next;

        node(int val){
            this.data=val;
        }
    }

    public static int length(node head){
        int count =0;
        node temp = head;
        while(temp!=null){
            temp=temp.next;
            count=count+1;
        }
        return count;

    }
    public static void main(String[] args) {
        node a = new node(45);
        node b = new node(41);
        node c = new node(40);
        node d = new node(456);
        node e = new node(425);
        node f = new node(459);

        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;

        System.out.println(length(a));
    }
}
