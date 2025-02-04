package Linked_List;

public class InsertMethod {
  

    public static class node {  // Inner class (optional: make it static)
        int data;
        node next;

        node(int val) {
            this.data = val;
        }
    }
    node head;
    public int size() {
        node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    void insertend(int index, int val) {
        // Implementation needed
    }

    public static void main(String[] args) {
        InsertMethod list = new InsertMethod();
       node a = new node(12);
       node b = new node(10);
       node c = new node(32);
       a.next=b;
       b.next=c;
       c.next=null;
       list.head=a;
       System.out.println(list.size());
    }
}
