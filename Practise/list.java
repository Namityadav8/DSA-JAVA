package Practise;
import java.util.*;
public class list {
    public static void main(String[] args) {
        ArrayList<Integer> ai = new ArrayList<>();

        ai.add(12);
        ai.add(234);
        for (int i=0;i<ai.size();i++){
            System.out.println(ai.get(i));
        }
    }
}
