package java_Practice_hand;

import java.io.*;

// 10000000 => 10,000,000 으로 변환

public class JavaPractice_231206_exam2 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		String num = br.readLine();
		
		StringBuffer numArr = new StringBuffer();
		numArr.append(num);

		for ( int i = num.length()-3; i > 0; i-=3 ) {
			numArr.insert(i,",");
		}
		
		System.out.println(numArr);
		
	}
	

	
}
