package chapter07;

import java.util.Scanner;

public class Number02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String s = sc.next();
		int sum = 0;
		
		for(int i=0; i<num; i++) {
			sum += (s.charAt(i) - '0');
		}
		System.out.println(sum);
		sc.close();
	}

}
