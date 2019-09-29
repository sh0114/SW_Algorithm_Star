package star;
import java.util.*;

public class p2445 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String res = "";
		for(int i = 1; i<=n; i++) {
			res ="";
			for (int j = 1; j <= i; j++) 
				res = res + "*";	
			for (int k = 1; k <= 2*(n -i); k++)
				res = res + " ";
			for (int j = 1; j <= i; j++)
				res = res + "*";
			System.out.println(res);
		}

		for (int i = n-1; i >= 1; i--)
		{
			res = "";
			for (int j = 1; j <= i; j++)
				res = res+"*";
			for (int k = 1; k <= 2*n - 2*i; k++)
				res = res+" ";
			for (int j = 1; j <= i; j++)
				res = res+"*";
			System.out.println(res);
		}
		
		
		sc.close();
	}
}
