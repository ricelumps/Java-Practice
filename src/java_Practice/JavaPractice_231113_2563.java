package java_Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class JavaPractice_231113_2563 {

	public static void main(String[] args) throws IOException {

		
		// 입출력 객체 생성 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// a : 색종이 개수
		int a = Integer.parseInt(br.readLine());
		
		// 색종이들의 x,y 좌표
		int b[][] = new int[a][2];
		
		// 도화지
		int c[][] = new int[100][100];  
		
		// 입력에서 빈칸 구분 위한 String 토큰화 객체 생성
		StringTokenizer st;
		
		// x,y 좌표(b) 입력문
		for ( int i = 0; i < b.length; i++ ) {
			st = new StringTokenizer(br.readLine());
			
			for ( int j = 0; j < b[i].length; j++ ) {
				b[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		// 색종이 개수만큼 반복
		for ( int i = 0; i < a; i++ ) {

			
			// i번 색종이의 x좌표(j)부터 + 10까지
			for ( int j = b[i][0]; j <= b[i][0] + 9; j++ ) {
				
				// i번 색종이의 y좌표(k)부터 + 10까지
				for ( int k = b[i][1]; k <= b[i][1] + 9; k++ ) {
					
					// 10 * 10번만큼 반복
					c[j][k] = 1;
					
				}
			}	
			
			// 디버그
		//	for ( int t = 0; t < 100; t++ ) {
		//		System.out.println(Arrays.toString(c[t]));
		//	}
			
		}
		
		//for ( int i = 0; i < 100; i++ ) {
		//	System.out.println(Arrays.toString(c[i]));
		//}
		
		// 색종이들의 넓이 계산할 최종 변수
		int sum = 0;
		
		// 도화지에 있는 색종이 넓이 ( 0이 아닌 것들 ) 계산, 도화지 넓이만큼 확인
		for ( int i = 0; i < 100; i++ ) {
			for ( int j = 0; j < 100; j++ ) {
				
				// 만약 0이 아니면 sum에 1 추가
				if ( c[i][j] == 1 )sum += c[i][j];
				
			}
		}
		
		System.out.println(sum);
		
		bw.close();
		br.close();
		
		
	}

}
