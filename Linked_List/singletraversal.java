package Linked_List;

public class singletraversal {
    public static node nthnodefromlast(node head ,int val){
        node slow = head;
        node fast = head;

        for(int i=1;i<=val;i++){
            fast=fast.next;
        }

        while(fast!=null){
            slow=slow.next;
            fast=fast.next;
        }

        return slow;
    }
    public static class node{
        int data ;
        node next;

        public node(int val){
            this.data=val;
        }
    }
    public static void main(String[] args) {
        

        node a = new node(20);
        node b = new node(25);
        node c = new node(30);
        node d = new node(35);
        node e = new node(40);
        node f = new node(45);

        // Linking the nodes together
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = null;

        node t = nthnodefromlast(a, 4);
        System.out.println(t.data);
    }
}
