package star;
import java.util.Scanner;

public class p2443 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result = "";
		for(int i = n; i >= 1; i--) {
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
