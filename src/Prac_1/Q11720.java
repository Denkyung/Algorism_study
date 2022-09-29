package Prac_1;

import java.util.Scanner;

public class Q11720 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		String st = sc.next();
		int total = 0;
		//for 문을 n번만큼 돌려서 number의 N 숫자를 합한다.
		for(int i=0; i< num; i++) {
			//st에서 char 형태를 int형시으로 반환 하기 위해서는 48을 뺀다 (아스키 코드값을 사용하기 때문)
			//charAt()을 이용하면 char형태로 반환한다.
			total += st.charAt(i) - '0';
		}
		sc.close();
		System.out.println(total);
	}
}
