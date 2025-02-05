package Linked_List;

public class Ques_1 {

    public static node nthnode(node head,int value){
        node temp = head;
        int count=0;
        while(temp.next!=null){
            count++;
            temp=temp.next;
        }
        
        int size = count-value+1;
        temp = head;
        for(int i=1;i<size-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static class node{
        int data ;
        node next;

        node(int val){
            this.data=val;  
        } 
    }
    public static void main(String[] args) {
        node a = new node(23);
        node b = new node(21);
        node c = new node(22);
        node d = new node(45);
        node e = new node(67);
        node f = new node(87);

        Ques_1 t = new Ques_1();
      
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        node x = nthnode(a, 4);
        System.out.println(x.data);

        
    }
}
