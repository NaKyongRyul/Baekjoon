package chapter03;

import java.util.Scanner;

public class Number08 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[] arr = new int[a];
		
		for(int i=0; i<a; i++) {
			int b = sc.nextInt();
			int c = sc.nextInt();
			arr[i] = b + c;
		}
		for(int i=0; i<a; i++) {
			System.out.println("Case #" + (i+1) + ": " + arr[i]);
		}

	}

}
