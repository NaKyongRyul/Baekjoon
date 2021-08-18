package chapter03;

import java.io.*;
import java.util.StringTokenizer;

public class Number05 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		StringTokenizer st;
		
		for(int i=0; i<a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
