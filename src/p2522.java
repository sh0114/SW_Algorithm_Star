package star;
import java.util.*;
public class p2522 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		for(int i=n-1; i>=0; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=n-1; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
