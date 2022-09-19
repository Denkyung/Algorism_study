package Prac_1;

import java.util.Scanner;

public class Q2525 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
 
        int A = sc.nextInt();
        int B = sc.nextInt();
 
        int C = sc.nextInt();
 
        int min = 60 * A + B;   // ½Ã -> ºĞ
        min += C;
 
        int hour = (min / 60) % 24;
        int minute = min % 60;
 
        System.out.println(hour + ":" + minute);
 
    }
}
