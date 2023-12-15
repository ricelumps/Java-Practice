package java_Practice_hand;

import java.io.*;

// 10000000 => 10,000,000 으로 변환

public class JavaPractice_231206_exam {

	public static void main(String[] args) throws IOException {

		
		System.out.println(execute("235530","700"));
		
	}
	
	static String execute( String A, String B ) {
		
		String hour = A.substring(0,2);
		String min = A.substring(2,4);
		String sec = A.substring(4,6);
		int int_sec = Integer.parseInt(sec);
		int int_min = Integer.parseInt(min);
		int int_hour = Integer.parseInt(hour);
		int int_B = Integer.parseInt(B);
		
		int_sec += int_B;
		
		while ( int_sec > 59 ) {
			
			int_min++;
			int_sec -= 60;
			
			if ( int_min > 59 ) { 
				int_hour++; 
				int_min -= 60;
			}
			
			if (int_hour > 23 ) int_hour = 0;
		}
		
		String result = String.format("%02d",int_hour)
				+ String.format("%02d",int_min) 
				+ String.format("%02d",int_sec);
		return result;
		
	}
	
}
