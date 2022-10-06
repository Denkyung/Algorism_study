package Prac_2210;

import java.util.Scanner;

public class Q2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//parseInt -> toString으로 위치 반환
		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		
		
		System.out.println( A> B ? A:B);
	}
}
