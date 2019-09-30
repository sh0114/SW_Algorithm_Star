package Star;
import java.util.*;

public class p2446 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		String result = "";
		for(int i = n; i >=1; i--) {
			result = "";
			for(int j = 0; j<n-i;j++) {
				result = result + " ";
			}
			for(int j = 0; j<2*i-1;j++) {
				result = result + "*";
			}
			System.out.println(result);
		}
		for(int i = 2; i <=n; i++) {
			result = "";
			for(int j = 1; j<=n-i;j++) {
				result = result + " ";
			}
			for(int j = 0; j<2*i-1;j++) {
				result = result + "*";
			}
			System.out.println(result);
		}
	}
}
