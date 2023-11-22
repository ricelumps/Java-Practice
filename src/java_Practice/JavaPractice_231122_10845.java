package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JavaPractice_231122_10845 {
	public static void main(String[] args) throws IOException {
	
		// 입력 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받을 변수의 갯수
		int A = Integer.parseInt(br.readLine());
	
		// queue 생성
		ArrayList<Integer> queue = new ArrayList<>();

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
						// queue의 크기가 0보다 크면
						if ( queue.size() != 0 ) {
							
							// queue의 가장 아래 정수 출력
							System.out.println(queue.get(0));
							// queue의 가장 아래 정수 삭제
							queue.remove(0);
						
						// queue에 아무것도 없으면
						} else {
							// -1 출력
							System.out.println("-1");
						}
						break;
						
					// "size"인 경우
					case "size":
						
						// queue의 크기 출력
						System.out.println(queue.size());
						
						break;
					
					// "empty"인 경우
					case "empty":
						
						// queue의 크기가 0 보다 클 경우
						if ( queue.size() != 0 ) {
							System.out.println("0");
							
						// queue에 아무것도 없을 경우
						} else {
							System.out.println("1");
						}
						
						break;
						
					// "back"인 경우
					case "front":
						
						// queue의 크기가 0보다 클 경우
						if ( queue.size() != 0 ) {
							System.out.println(queue.get(0));
						} else {
							
							// queue에 아무것도 없을 경우
							System.out.println("-1");
						}
						
						break;
				
					case "back":
						
						// queue의 크기가 0보다 클 경우
						if ( queue.size() != 0 ) {
							System.out.println(queue.get(queue.size()-1));
						} else {
							
							// queue에 아무것도 없을 경우
							System.out.println("-1");
						}
						
						break;
				
				}
				
				// 입력받은 문자열이 1보다 크고, 첫번째 문장이 push인 경우
			} else if(st.nextToken().equals("push")) {
				queue.add(Integer.parseInt(st.nextToken()));
			}
			
			
		}
		
	}
	
}
