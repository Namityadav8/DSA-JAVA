package Linked_List;
public class practise {
    public static class node{
        int data;
        node next;   // this is the address storing part 

        public  node(int val){
            this.data = val;
        }
}


    public static void main(String[] args) {
        node a = new node(25);
        node b = new node(12);
        node c = new node(11);
        a.next=b;
        System.out.println(a.data);
    }
}