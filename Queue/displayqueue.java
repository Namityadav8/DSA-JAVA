package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class displayqueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(12);
        q.add(14);
        q.add(265);
        q.add(645);
        q.add(65);
        System.out.println(q);

        Queue<Integer> h = new ArrayDeque<>();
        while(q.size()>0){
            System.out.println(q.peek());
            h.offer(q.remove());
        }
System.out.println(h);
        while(h.size()>0){
            q.offer(h.remove());
        }

        System.out.println(q);
    }
}