package java_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class JavaPractice_231123_10814 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(br.readLine());
		
		String List[][] = new String[A][3];
		
		StringTokenizer st;
		for ( int i = 0 ; i < A; i++ ) {
			st = new StringTokenizer(br.readLine()," ");
			
			for ( int j = 0; j < List[i].length-1; j++ ) {
				List[i][j] = st.nextToken();
			}			
			List[i][2] = Integer.toString(i);
		}
		
		Arrays.sort(List, new Comparator<String[]>() {
		
			@Override
			public int compare(String[] o1, String[] o2) {
				if ( o1[0] != o2[0] ) {
					return Integer.parseInt(o1[0])-Integer.parseInt(o2[0]);
				} else {
					return Integer.parseInt(o2[1])-Integer.parseInt(o1[1]);
				}
				
			}
		
		});
		
		
		for ( int i = 0; i < List.length; i ++ ) {
			bw.write(List[i][0] + " " + List[i][1] + "\n");
		}
		
		bw.flush();
		bw.close();
		br.close();
		
	}
}
