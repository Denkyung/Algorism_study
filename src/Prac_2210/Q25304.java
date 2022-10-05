package Prac_2210;

import java.util.Scanner;

public class Q25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//총 가격 합
		int ttl = sc.nextInt();
		//물품 종류
		int cnt = sc.nextInt();
		
		//반복문 통해서 연산
		for(int i=0; i<cnt; i++) {
			int price = sc.nextInt();
			int num = sc.nextInt();
			//가격 대조함
			ttl = ttl - (num* price);
		}
		
		if(ttl == 0) System.out.println("Yes");
        else System.out.println("No");
		
		
	}
}
//못 푼 이유  -- 코드 자체는 쉬운데 문장이 어려움
