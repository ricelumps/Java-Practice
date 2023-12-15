package java_Practice_hand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaPractice_231205_2751_hand {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		
		for ( int i = 0 ; i < arr.length; i++  ) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		for ( int i = 0; i < arr.length-1; i++ ) {
			int index = i;
			
			for ( int j = i + 1; j < arr.length; j++ ) {
				
				if ( arr[index] > arr[j] ) index = j; 
				
			}
			
			if ( index != i ) {
				int tmp = arr[i];
				arr[i] = arr[index];
				arr[index] = tmp;
			}
			
		}
		
		for ( int i = 0; i < arr.length; i++ ) {
			bw.write(arr[i] + "\n");
		}
		
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
