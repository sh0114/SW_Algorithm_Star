package star;

import java.util.Scanner;

public class p10992 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=0; i<n-1;i++) {
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
		for(int i=0; i<2*n - 1; i++) {
			System.out.print("*");
		}
		System.out.println();
		sc.close();
	}
}
