package star;
import java.util.*;
public class p10990 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0; i<n;i++) {
			for(int j=0; j<n-1-i; j++) {
				System.out.print(" ");
			}
			System.out.print("*");
			if(i == 0) {
				System.out.println();
				continue;
			}else {
				for(int j=0; j<2*i-1; j++) {
					System.out.print(" ");
				}
				System.out.print("*");
				System.out.println();
			}
		}
		sc.close();
	}
}
