package java_Practice_hand;

import java.io.*;
import java.util.*;

public class JavaPractice_231201_hand2_BubbleSort {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for ( int i = 0; i < arr.length; i++ ) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for ( int i = 0; i < K; i++ ) {
			for ( int j = 0; j < arr.length-1; j++ ) {
				if ( arr[j] > arr[j+1] ) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
				
			}
		}
		
		for ( int i = 0; i < arr.length; i++ ) { 
			bw.write(arr[i] + " ");
		}
		
		bw.flush();
		bw.close();
		br.close();
	}
}
