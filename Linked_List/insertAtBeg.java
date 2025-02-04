package Linked_List;

class insertAtBeg {
    static class node {
        int data;
        node next;
        public node(int val){
            this.data=val;
            this.next=null;
        }
    }
    node head;



    public void putbeg(int val1){
        node temp = new node(val1);
    }


    public static void main(String[] args) {
        insertAtBeg ll = new insertAtBeg();
        ll.putbeg(12);
    }
}
