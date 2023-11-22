package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Stack;
import java.util.StringTokenizer;

public class JavaPractice_231122_10829_B {
	public static void main(String[] args) throws IOException {
	
		// 입력 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받을 변수의 갯수
		int A = Integer.parseInt(br.readLine());
	
		// stack 생성
		Stack<Integer> stack = new Stack<>();
		
		// 변수 갯수동안 반복 ( for 문 )
		for ( int i = 0; i < A; i++ ) {

			// 입력받을 명령
			String str = br.readLine();
			// 빈칸에 따라 분류
			StringTokenizer st = new StringTokenizer(str); 
		
			// 단어가 2개 미만인 경우
			if ( st.countTokens() < 2 ) {
				
				// 명령에 따라 분류 ( switch문 )
				switch(str) {
				
					// "pop"인 경우
					case "pop":
						// stack의 크기가 0보다 크면
						if ( stack.size() != 0 ) {
							
							// stack의 가장 위의 정수 출력
							System.out.println(stack.get(stack.size()-1));
							// stack의 가장 위의 정수 삭제
							stack.remove(stack.size()-1);
						
						// stack에 아무것도 없으면
						} else {
							// -1 출력
							System.out.println("-1");
						}
						break;
						
					// "size"인 경우
					case "size":
						
						// stack의 크기 출력
						System.out.println(stack.size());
						
						break;
					
					// "empty"인 경우
					case "empty":
						
						// stack의 크기가 0 보다 클 경우
						if ( stack.size() != 0 ) {
							System.out.println("0");
							
						// stack에 아무것도 없을 경우
						} else {
							System.out.println("1");
						}
						
						break;
						
					// "top"인 경우
					case "top":
						
						// stack의 크기가 0보다 클 경우
						if ( stack.size() != 0 ) {
							System.out.println(stack.get(stack.size()-1));
						} else {
							
							// stack에 아무것도 없을 경우
							System.out.println("-1");
						}
						
						break;
				
				}
				
				// 입력받은 문자열이 1보다 크고, 첫번째 문장이 push인 경우
			} else if(st.nextToken().equals("push")) {
				stack.add(Integer.parseInt(st.nextToken()));
			}
			
			
		}
		
	}
	
}
