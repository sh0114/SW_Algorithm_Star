package star;

import java.util.Scanner;

public class p10991 {
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
				for(int j=0; j<i; j++) {
					System.out.print(" ");
					System.out.print("*");
				}
				System.out.println();
			}
		}
		sc.close();
	}
}
