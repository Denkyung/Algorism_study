package Prac_1;

import java.util.Arrays;
import java.util.Scanner;

public class Q10818 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//인덱스 개수
		int nx = sc.nextInt();
		int[] x = new int[nx];
		
		//배열 안에 숫자 개수
		for(int i = 0; i < nx; i++) {
			x[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.stream(x).max().getAsInt());
		System.out.println(Arrays.stream(x).min().getAsInt());

	}

}
