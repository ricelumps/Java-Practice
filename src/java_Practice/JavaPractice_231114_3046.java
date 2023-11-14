package java_Practice;

import java.io.IOException;
import java.util.Scanner;

public class JavaPractice_231114_3046 {

	public static void main(String[] args) throws IOException {
		
		// 입력 객체 생성
		Scanner sc = new Scanner(System.in); 
		
		// 두 변수에 넣을 정수 입력
		int R1 = sc.nextInt();
		int S = sc.nextInt();
	
		// (a+b)/2 에서 b를 찾는 식
		int R2 = S*2 - R1;
		
		System.out.println(R2);
		
	}
	
}
