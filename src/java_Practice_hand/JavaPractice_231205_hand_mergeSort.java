package java_Practice_hand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class JavaPractice_231205_hand_mergeSort {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		for ( int i = 0; i < N; i++ ) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		int length = arr.length-1;
		
		mergeSort(arr, 0, length);
		
		for ( int i = 0; i < arr.length; i++ ) {
			bw.write(arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	
	static void mergeSort(int arr[], int left, int right ) {
		if ( left < right ) {
			int middle = (right + left ) / 2;
			
			mergeSort(arr, left, middle);
			mergeSort(arr, middle+1, right);
			merge(arr, left, middle, right);	
		}	
	}
	
	static void merge(int arr[], int left, int middle, int right) {
		
		int n1 = middle - left + 1;
		int n2 = right - middle;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		System.arraycopy(arr, left, leftArr, 0, n1);
		System.arraycopy(arr, middle+1, rightArr, 0, n2);
		
		int i = 0, j = 0, k = left;
		
		while ( i < n1 & j < n2 ) {
			if ( leftArr[i] <= rightArr[j] ) {
				arr[k] = leftArr[i++];
			} else {
				arr[k] = rightArr[j++];
			}
			k++;
		}
		
		while ( i < n1 ) {
			arr[k++] = leftArr[i++];
		}
		
		while ( j < n2 ) {
			arr[k++] = rightArr[j++];
		}
		
	}
	
}
