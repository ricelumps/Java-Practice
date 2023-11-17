package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JavaPractice_231117_2798 {
	
	public static void main(String[] args) throws IOException {
		
		// 입력, 입력받은 문자열 분리 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 입력받을 수의 개수, 최대 수 변수
		int count = Integer.parseInt(st.nextToken());
		int max = Integer.parseInt(st.nextToken());
		
		// 수의 개수만큼 배열 생성
		int numbers[] = new int[count];
		
		// 최종 결과 변수
		int result = 0;
		
		// 다시 입력받아 문자열 분리시킨 후 st 객체에 저장
		st = new StringTokenizer(br.readLine());
		
		// 입력받은 숫자들 배열에 저장
		for ( int i = 0; i < numbers.length; i++ ) {
			numbers[i] = Integer.parseInt(st.nextToken());
		}
		
		
		// 모든 경우의 수 찾으면서 최대 수와 제일 가까운 숫자 찾기 ( 3중 for문 )
		for ( int i = 0; i < numbers.length - 2; i++ ) {
			for ( int j = i+1; j < numbers.length -1; j++ ) {
				for ( int k = j+1; k < numbers.length; k++ ) {
					
					// 만약 i,j,k 자리의 배열수를 더한 값이 최대 수보다 작거나 같고, 현재까지 입력받은 결과값보다 크면
					if ( (numbers[i] + numbers[j] + numbers[k]) <= max 
							& (numbers[i] + numbers[j] + numbers[k]) > result ) {
						// 결과값에 더한 값 입력
						result = numbers[i] + numbers[j] + numbers[k];
					}
					
				}
			}
		}
		
		// 결과 값 출력
		System.out.println(result);
		
	}	
}
