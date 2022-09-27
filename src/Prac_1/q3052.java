package Prac_1;

import java.util.*;

public class q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		//remain은 set으로 선언되니 int가 아니라 Integer로 선언함
		Integer[] remain = new Integer[10];
		
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
			//여기서 중요!!
			remain[i] = num[i] %42;
		}
		//Arrays.asList(remain) -> ArrayList를 리턴함
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(remain));
		
		int x = s1.size();
		System.out.println(x);
	}
}
