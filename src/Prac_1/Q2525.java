package Prac_1;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//h 와 m은 같은 분단위로 시작한다.
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int cook = sc.nextInt();
		
		//모든 건 분으로(작게) 환산한다. 시 -> 분
		int min = h*60 + m;
		min += cook;
		
		int hour = (min % 60) % 24;
		int minutes = min %60;
		
		System.out.println(hour + ":" + minutes);
		sc.close();
	}
}
