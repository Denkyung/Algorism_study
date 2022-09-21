package Prac_1;

import java.util.Scanner;

public class Q2739 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int i =0;
		
		while(i+1<10) {
			i++;
			System.out.println(n + " * " + i + " = " + n * i);
		}
	}
}
