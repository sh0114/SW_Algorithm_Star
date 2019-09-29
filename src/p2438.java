package star;
import java.util.*;
public class p2438 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String result = "";
		for(int i = 0; i<n; i++) {
			result = "";
			for(int j = 0; j <= i; j++) {
				result = result +'*';
			}
			System.out.println(result);
		}
		
		sc.close();
	}

}
