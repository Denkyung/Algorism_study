package Prac_1;

import java.util.*;

public class q3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		//remain�� set���� ����Ǵ� int�� �ƴ϶� Integer�� ������
		Integer[] remain = new Integer[10];
		
		for(int i =0; i<num.length; i++) {
			num[i] = sc.nextInt();
			//���⼭ �߿�!!
			remain[i] = num[i] %42;
		}
		//Arrays.asList(remain) -> ArrayList�� ������
		Set<Integer> s1 = new HashSet<Integer>(Arrays.asList(remain));
		
		int x = s1.size();
		System.out.println(x);
	}
}
