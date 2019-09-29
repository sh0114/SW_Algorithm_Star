package star;
import java.util.*;

public class p2439 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result = "";
		for(int i=1; i<=n; i++) {
			result = "";
			for(int j=1; j<=n-i;j++) {
				result = result + " ";
			}
			for(int j=1; j<=i;j++) {
				result = result + "*";
			}
			System.out.println(result);
		}
		
		sc.close();
	}
}
