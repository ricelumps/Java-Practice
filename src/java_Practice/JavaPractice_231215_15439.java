package java_Practice;

import java.io.*;
import java.util.*;

public class JavaPractice_231215_15439 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		long sum = 0;
		for ( int i = 1; i <= N; i ++ ) {
			for ( int j = 1; j <= N; j++ ) {
				if ( i != j ) sum++;
			}
		}
		
		
		System.out.println(sum);
		
	}
}
