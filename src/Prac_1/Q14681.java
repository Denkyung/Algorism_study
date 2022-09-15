import java.util.*;

public class Q14681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		
		if(a >0 && b>0) {
			System.out.println(1); 
		} else if(a <0 && b >0) {
			System.out.println(2);
		} else if(a <0 && b <0) {
			System.out.println(3); 
		} else {
			System.out.println(4);
		}
	}
}
