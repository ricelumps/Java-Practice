package java_Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaPractice_231114_1259 {
	
	public static void main(String[] args) throws IOException{
		
		// 입력 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 숫자의 개수 입력 
		int cnt = Integer.parseInt(br.readLine());
		
		// '숫자', '뒤집은 숫자', '총 합계', '합계에 대한 판단' 배열 변수
		int nums[] = new int[cnt];
		int reverse[] = new int[cnt];
		int sums[] = new int[cnt];
		String flag[] = new String[cnt];
		
		// 숫자 개수만큼 for문
		for ( int i = 0; i < cnt; i++ ) {
			
			// 숫자 입력받기
			nums[i] = Integer.parseInt(br.readLine());
			
			// i번째 총 합계에 숫자 입력
			sums[i] += nums[i];
			
			// 숫자가 0이 될 때까지
			while(nums[i]!=0) {
				
				// 숫자를 10으로 나눈 나머지 + 뒤집은 숫자 입력받을 변수 * 10 으로 뒤집은 숫자 입력
				reverse[i] = reverse[i]*10 + nums[i] % 10;
				
				// 숫자 10으로 나눈 몫 입력하기
				nums[i]/=10;
			}
			
			// while문 통해 뒤집은 숫자 sums(총 합계 배열변수)에 입력
			sums[i] += reverse[i];
			
			
			// 합계 숫자의 길이만큼 반복 ( for ) 
			for ( int j = 0; j < Integer.toString(sums[i]).length(); j++ ) {
				
				// 만약 숫자의 j번째 길이(첫번째부터)와 숫자의 ( 숫자의 길이 - (i+1) )번째 길이 (마지막부터) 가 맞지 않으면 
				if ( Integer.toString(sums[i]).charAt(j) != Integer.toString(sums[i]).charAt(Integer.toString(sums[i]).length()-(1+j))) {
					// 합계에 대한 판단을 내리는 i번째 배열변수 에 NO 입력 
					flag[i] = "NO";
					break;
				} else {
					// 그 외 YES 입력
					flag[i] = "YES";
				}
			}
		}
		
	for ( int i = 0; i < flag.length; i++ ) {
		System.out.println(flag[i]);
	}
		
	}
}
