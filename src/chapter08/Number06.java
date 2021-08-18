package chapter08;

import java.util.Scanner;

public class Number06 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] apt = new int[15][15];
		
		for(int i=0; i<15; i++) {
			apt[i][1] = 1;
			apt[0][i] = i;
		}
		
		for(int i=1; i<15; i++) {
			for(int j=2; j<15; j++) {
				apt[i][j] = apt[i][j-1] + apt[i-1][j];
			}
		}
		
		int a = sc.nextInt();
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			System.out.println(apt[b][c]);
		}
	}
}
