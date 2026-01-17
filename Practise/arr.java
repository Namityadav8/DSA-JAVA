package Practise;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for(int i=0;i<5;i++){
            a[i] =sc.nextInt();
        }
        int start=0;
        int end = a.length-1;
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            end--;
            start++;
        }

        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
    }
}
