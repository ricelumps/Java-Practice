package java_Practice;

import java.io.*;
import java.util.*;

public class JavaPractice_231215_2960 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		int result = 0;
		ArrayList<Integer> Arr = new ArrayList<Integer>();
		
		for ( int i = 2; i <= N; i++ ) {
			Arr.add(i);
		}

		while ( cnt != K ) {
			
			int idx = Arr.get(0);
			
			for ( int i = 0; i <= Arr.size()-1; i++ ) {
				
				if ( cnt == K ) break;
				
				if ( Arr.get(i) % idx == 0 ) {
					result = Arr.get(i);
					Arr.remove(i);
					cnt++;
				}
			
			}
				
		}
		
		System.out.println(result);
		
	}
}
