package Prac_1;

import java.util.Scanner;

public class Q11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String st = sc.next();
		int total = 0;
		//for ���� n����ŭ ������ number�� N ���ڸ� ���Ѵ�.
		for(int i=0; i< num; i++) {
			//st���� char ���¸� int�������� ��ȯ �ϱ� ���ؼ��� 48�� ���� (�ƽ�Ű �ڵ尪�� ����ϱ� ����)
			//charAt()�� �̿��ϸ� char���·� ��ȯ�Ѵ�.
			total += st.charAt(i) - '0';
		}
		sc.close();
		System.out.println(total);
	}
}
