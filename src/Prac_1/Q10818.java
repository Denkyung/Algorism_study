package Prac_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//�ε��� ����
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		//�迭 �ȿ� ���� ����
		for(int i = 0; i < nx; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.stream(x).max().getAsInt());
		System.out.println(Arrays.stream(x).min().getAsInt());

	}

}
