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

    int size() {
        node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }
    void deleteAt(int indx){
        node temp = head;
        for(int i=1;i<=indx-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next; // it will be putting the node to the element after the deletion part

    }

    void insertval(int index, int val) {
        node t = new node(val);
        node temp = head;
        for (int i = 1; i <= index - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next; // Assign the new node address to the after part
        temp.next = t;      // Assign the pre part to the new node
    }

    void insertatend(int value) {
        node t = new node(value); // Create a new node with the value
        node temp = head;
        // Traverse to the last node (where temp.next is null)
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = t; // Link the new node at the end
    }

    void displayll() {
        node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        InsertMethod list = new InsertMethod();
        node a = new node(12);
        node b = new node(10);
        node c = new node(32);
        a.next = b;
        b.next = c;
        list.head = a;

        // list.insertval(1, 15); // Insert 15 at position 1
        // list.displayll(); 

        // list.insertatend(99); // Insert 99 at the end
        list.deleteAt(1);
        System.out.println(list.size());
        list.displayll(); // Display the list again
    }
}
