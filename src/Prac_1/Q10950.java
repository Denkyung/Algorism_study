package Prac_1;

import java.util.Scanner;

public class Q10950 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b); 
		}
		
		sc.close();
	}
}
