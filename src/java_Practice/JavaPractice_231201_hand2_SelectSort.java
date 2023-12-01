package java_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JavaPractice_231201_hand2_SelectSort {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		String changed[] = new String[N];
		int changed_idx = 0;
		
		st = new StringTokenizer(br.readLine());
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		for ( int i = arr.length-1; i >= 1; i-- ) {
			int idx = i;
			for ( int j = i-1; j >= 0; j-- ) {	
				if ( arr[idx] < arr[j] ) {
					idx = j;
				}
			}
			
			if ( idx != i ) {
				int tmp = arr[i];
				arr[i] = arr[idx];
				arr[idx] = tmp;
				changed[changed_idx++] = arr[idx] + " " + arr[i];
			}
		}
		
		if ( changed[K-1] == null )
			System.out.println("-1");
		else
			System.out.println(changed[K-1]);
		
	}
}
