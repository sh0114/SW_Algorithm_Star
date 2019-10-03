package star;

import java.util.*;

public class p2448 {
	static char[][] pyramid;
	static void makePyramid(int x, int y, int n) {
		if (n == 3) {

			for(int i=x; i<x+3; i++) {
				for(int j=y-2; j<=y+3; j++) {
					if(i==x && j==y) {
						pyramid[i][j] = '*';
					}else if(i==x+1&&(j==y-1||j==y+1)) {
						pyramid[i][j] = '*';
					}else if(i==x+2 && (j >= y-3 && j <=y+2)) {
						pyramid[i][j] = '*';
					}else {
						pyramid[i][j] = ' ';
					}
				}
			}
			return ;
		}
		
		makePyramid(x,y,n/2);
		makePyramid(x + n / 2, y - n / 2, n / 2);
		makePyramid(x + n / 2, y + n / 2, n / 2);
		

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		pyramid = new char[n][2*n];
		for(int i=0; i<n; i++) {
			Arrays.fill(pyramid[i], ' ');
		}
		makePyramid(0,n-1,n);
		for(int i=0; i<n;i++) {
			System.out.println(pyramid[i]);
		}

		sc.close();
	}
}
