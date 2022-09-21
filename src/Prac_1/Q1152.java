package Prac_1;

import java.util.Scanner;

import java.util.StringTokenizer;

public class Q1152 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		String A = sc.nextLine();

		
		StringTokenizer st = new StringTokenizer(A, " ");
		System.out.println(st.countTokens()); 
		 
		
		
//		for(int i=0; i< A.length(); i++) {
//			if( A != " ") {
//				System.out.println("cnt :" + null );
//			} else {
//				cnt ++;
//				System.out.println("cnt :" + cnt);
//			}
//		}
				
		sc.close();
	}
}
