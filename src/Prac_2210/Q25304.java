package Prac_2210;

import java.util.Scanner;

public class Q25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�� ���� ��
		int ttl = sc.nextInt();
		//��ǰ ����
		int cnt = sc.nextInt();
		
		//�ݺ��� ���ؼ� ����
		for(int i=0; i<cnt; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			//���� ������
			ttl = ttl - (num* price);
		}
		
		if(ttl == 0) System.out.println("Yes");
        else System.out.println("No");
		
		
	}
}
//�� Ǭ ����  -- �ڵ� ��ü�� ��� ������ �����
