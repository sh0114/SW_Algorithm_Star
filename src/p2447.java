package Star;

import java.util.*;

public class p2447 {
	
	static char star[][];
	
	static void makeStar(int x, int y, int n) {
		if(n == 1) {
			star[x][y] = '*';
			return ;
		}
		int m = n / 3;
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if(i == 1 & j == 1) continue;
//				System.out.print(i);
//				System.out.print(" ");
//				System.out.print(j);
//				System.out.print(" ");
//				System.out.print(m);
//				System.out.println();
				makeStar(x + m * i, y + m * j, m);
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.close();
		star = new char[n][n];
		for(int i = 0; i < n; i++) {
			Arrays.fill(star[i], ' '); // 한줄씩 채움
		}
		makeStar(0, 0, n);
		
		for(int i = 0; i < n; i++) {
			System.out.println(star[i]);
		}
	}

}





//public class p2447 {
//
//	public static String[][] makeStar(int c) {
//
//		if (c == 1) {
//			String[][] star = new String[3][3];
//			for (int i = 0; i < 3; i++) {
//				for (int j = 0; j < 3; j++) {
//					if (i == 1 && j == 1)
//						star[1][1] = " ";
//					else
//						star[i][j] = "*";
//				}
//			}
//			return star;
//
//		} else {
//			int n = (int) Math.pow(3, c);
//			int bn = (int) Math.pow(3, c - 1);
//			String[][] star = new String[n][n];
//			String[][] temp = new String[bn][bn];
//			temp = makeStar(c - 1);
//			
//			for(int k=0; k<n; k=k+bn) {
//				for(int u =0; u<n; u=u+bn) {
//					for (int i = k, x=0; i < k+bn && x<bn; i++,x++) {
//						for (int j = u, y=0; j < u+bn&&y<bn; j++,y++) {
//							star[i][j] = temp[x][y];
//						}
//					}
//				}
//			}
//			
//			for (int i = bn; i < bn+bn; i++) {
//				for (int j = bn; j < bn+bn; j++) {
//					star[i][j] = " ";
//				}
//			}
//			
//			return star;
//		}
//
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		String[][] star = new String[n][n];
//
//		int tmp = n;
//
//		int c = 0;
//		while (n > 1) {
//			n = n / 3;
//			c++;
//		}
//
//		n = tmp;
//		star = makeStar(c);
//
//
//		for (int i = 0; i < tmp; i++) {
//			for (int j = 0; j < tmp; j++) {
//				System.out.print(star[i][j]);
//			}
//			System.out.println();
//		}
//
//		sc.close();
//	}
//}
