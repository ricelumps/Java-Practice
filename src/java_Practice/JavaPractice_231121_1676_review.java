package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPractice_231121_1676_review {

	public static void main(String[] args) throws IOException {
		
		// 입력 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 변수 a 입력
		int a = Integer.parseInt(br.readLine());
		
		// 0의 갯수를 셀 변수
		int count = 0;

		
		// N!의 0의 갯수 == N!을 소인수분해 했을 경우의 5의 갯수
		while ( a >= 5 ) {
			count += a / 5;
			a /= 5;
		}
		
		System.out.println(count);
		
		
	}
	
}
