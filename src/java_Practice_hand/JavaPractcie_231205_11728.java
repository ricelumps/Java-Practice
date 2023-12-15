package java_Practice_hand;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class JavaPractcie_231205_11728 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int Arr1[] = new int[A];
		int Arr2[] = new int[B];
		
		st = new StringTokenizer(br.readLine());
		for ( int i = 0; i < Arr1.length; i++ ) {
			Arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for ( int i = 0; i < Arr2.length; i++ ) {
			Arr2[i] = Integer.parseInt(st.nextToken());
		}
		
		int length = Arr1.length + Arr2.length;
		
		int result_Arr[] = new int[length]; 
		
		for ( int i = 0; i < Arr1.length; i++ ) {
			result_Arr[i] = Arr1[i];
		}
		
		int k = 0;
		for ( int i = Arr1.length; i < length; i++ ) {
			result_Arr[i] = Arr2[k++];
		}

		int last = result_Arr.length-1;
		
		mergeSort(result_Arr, 0, last);
		
		for ( int i = 0; i < result_Arr.length; i ++ ) {
			bw.write(result_Arr[i] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
	
	static void mergeSort(int Arr[], int left, int right ) {
		if ( left < right ) {
			int middle = (right + left ) / 2;
			
			mergeSort(Arr, left, middle);
			mergeSort(Arr, middle+1, right);
			merge(Arr, left, middle, right);
		}
		
		
	}
	
	static void merge(int Arr[], int left, int middle, int right ) {
		
		int n1 = middle - left + 1;
		int n2 = right - middle;
		
		int leftArr[] = new int[n1];
		int rightArr[] = new int[n2];
		
		System.arraycopy(Arr, left, leftArr, 0, n1);
		System.arraycopy(Arr, middle+1, rightArr, 0, n2);
		
		
		int i = 0, j = 0, k = left;
		
		
		while ( i < n1 & j < n2 ) {
			if ( leftArr[i] <= rightArr[j] ) {
				Arr[k] = leftArr[i++];
			} else {
				Arr[k] = rightArr[j++];
			}
			k++;
		}
		
		while ( i < n1 ) {
			Arr[k++] = leftArr[i++];
		}
		
		while ( j < n2 ) {
			Arr[k++] = rightArr[j++]; 
		}
	}
	
}
