package Prac_1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class q2941 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		
		str = str.replace("c=", "A");
		str = str.replace("c-", "A");
		str = str.replace("dz=", "A");
		str = str.replace("lj", "A");
		str = str.replace("nj", "A");
		str = str.replace("s=", "A");
		str = str.replace("z=", "A");
        str = str.replace("d-", "A");
		
		System.out.println(str.length());
	}

}
