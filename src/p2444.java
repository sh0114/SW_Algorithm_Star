package star;
import java.util.*;

public class p2444 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int len = 2*n - 1;
		String result = "";
		for(int i = 1; i <= n; i++) {
			result = "";
			int a = 2*i-1;
			for(int j = 1; j <= n-i; j++) {
				result = result + " ";
			}
			for(int j = 1; j<=a; j++) {
				result = result + "*";
			}
			System.out.println(result);

		}
		
		for(int i = n-1; i >= 1; i--) {
			result = "";
			int a = 2*i-1;
			for(int j = 1; j <= n-i; j++) {
				result = result + " ";
			}
			for(int j = 1; j<=a; j++) {
				result = result + "*";
			}
			System.out.println(result);

		}
		
		sc.close();
	}
}
