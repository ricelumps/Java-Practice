package java_Practice;

import java.io.*;
import java.util.*;

public class JavaPractice_231215_1292 {
	
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
	
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		
		for (int i = 1; i <= M; i++) {
			for (int j = 1; j <= i; j++) {
				if ( Arr.size() < M ) {
				Arr.add(i);
				}
			}
		}
		
		
		int sum = 0;
		for ( int i = N; i <= M; i++ ) {
			sum += Arr.get(i-1);
		}
		
		System.out.println(sum);
	}
}
