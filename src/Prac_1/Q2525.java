package Prac_1;

import java.util.Scanner;

public class Q2525 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//h �� m�� ���� �д����� �����Ѵ�.
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		int cook = sc.nextInt();
		
		//��� �� ������(�۰�) ȯ���Ѵ�. �� -> ��
		int min = h*60 + m;
		min += cook;
		
		int hour = (min % 60) % 24;
		int minutes = min %60;
		
		System.out.println(hour + ":" + minutes);
		sc.close();
	}
}
