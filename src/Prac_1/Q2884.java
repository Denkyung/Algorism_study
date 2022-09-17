package Prac_1;

import java.util.Scanner;

public class Q2884 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int hh;
		int mm;
		
		if( m <45) {
			if(h == 0) {
				hh = 23;
			} else {
				hh = h -1;
				
			}
			mm = (m + 60) -45;
		} else {
			hh = h;
			mm = m -45;
		}
		System.out.println( hh + ":" + mm);
		sc.close();
	}
}
