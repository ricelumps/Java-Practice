package java_Practice_hand;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPractice_231204_10809_hand {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int words[] = new int[26];
		String S = br.readLine();
		
		for ( int i = 0; i < words.length; i++ ) {
			words[i] = -1;
		}
		
		
		for ( int i = 0; i < S.length(); i ++ ) {
			words[S.charAt(i)-97] 
					= S.indexOf(S.charAt(i));
		}
		
		
		for ( int i = 0; i < words.length; i++ ) {
			System.out.print(words[i] + " ");
		}
	}
}
