package java_Practice_hand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaPractice_231204_1330_hand {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		String symbol = null;
		
		if ( A > B ) symbol = ">";
		else if ( A == B ) symbol = "==";
		else symbol = "<";
		
		System.out.println(symbol);
		
	}
	
}
