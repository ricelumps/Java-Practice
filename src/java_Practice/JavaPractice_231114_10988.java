package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPractice_231114_10988 {

	public static void main(String[] args) throws IOException {
		
		// 입력 개체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력받을 변수
		String str = br.readLine();
		
		// 판단할 flag 변수
		int flag = 1;
		
		
		// 입력받은 변수 길이만큼 반복 ( for문 )
		for ( int i = 0; i < str.length(); i++) {
			
			// 만약 i번째 글자가 ( 글자 길이 - ( 1 + i ) ) 번째(끝자리에서부터) 글자와 맞지 않다면 
			if ( str.charAt(i) != str.charAt(str.length()-(1+i)) ) {
				
				// flag 내림
				flag = 0;
				
				// for문 빠져 나오기
				break;
			}
			 
		}
		
		System.out.println(flag);
	}
}
