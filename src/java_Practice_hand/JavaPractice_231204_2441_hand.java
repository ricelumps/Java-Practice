package java_Practice_hand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPractice_231204_2441_hand {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String star = "*";
		
		int N = Integer.parseInt(br.readLine());
		
		for ( int i = 0; i < N; i++ ) {
			for ( int j = 0; j < N; j++ ) {
				if ( i != 0 & i > j ) {
					System.out.print(" ");
				} else {
					System.out.print(star);
				}
			}
			
			System.out.println();
		}
		
	}
}
