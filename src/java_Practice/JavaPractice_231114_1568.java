package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class JavaPractice_231114_1568 {
	
	public static void main(String[] args) throws IOException {
		
		// 입력 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자 입력변수 생성
		String num = "0";
		
		// 팰린드롬 판단 배열 생성
		ArrayList<String> flag = new ArrayList<String>(); 
		
		// 0이 나올때까지 반복 ( while )
		while (true) {
			
			// num 입력
			num = br.readLine();
			
			// 0인 경우 while문 탈출
			if ( num.equals("0") ) {
				break;
			}
			
			// 숫자 길이만큼 반복 ( for ) 
			for ( int i = 0; i < num.length(); i++ ) {
				
				// 만약 i번째 숫자(처음부터)와 (숫자의길이 - 1+i) 번째 숫자(마지막부터)가 일치하지 않으면 
				if( num.charAt(i) != num.charAt(num.length()-(1+i))) {
					// 배열에 no 삽입
					flag.add("no");
					break;
					
				// 위 조건이 일치하면서, i 가 마지막에 도달했으면
				} else if ( num.charAt(i) == num.charAt(num.length()-(1+i)) & i == num.length()-1 )  {
					// 배열에 yes 삽입
					flag.add("yes");
					break;
				}
				
			}
		}
		
		for ( int i = 0 ; i < flag.size(); i++ ) {
			System.out.println(flag.get(i));
		}
		
	}
}
