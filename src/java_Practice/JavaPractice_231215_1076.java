package java_Practice;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class JavaPractice_231215_1076 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		ArrayList<String> Arr = new ArrayList<>();
		
		for ( int i = 0; i < 3; i ++ ) {
			Arr.add(br.readLine());
		}
		
		
		long sum = 0;
		
		for ( int i = 0; i < Arr.size(); i++ ) {
			
			if (i != Arr.size() - 1) {
				switch (Arr.get(i)) {
					case "black":
						sum += 0;
						break;
					case "brown":
						sum += 1;
						break;
					case "red":
						sum += 2;
						break;
					case "orange":
						sum += 3;
						break;
					case "yellow":
						sum += 4;
						break;
					case "green":
						sum += 5;
						break;
					case "blue":
						sum += 6;
						break;
					case "violet":
						sum += 7;
						break;
					case "grey":
						sum += 8;
						break;
					case "white":
						sum += 9;
						break;

				}
			} else {
				switch (Arr.get(i)) {
				case "black":
					sum *= Math.pow(10, 0);
					break;
				case "brown":
					sum *= Math.pow(10, 1);
					break;
				case "red":
					sum *= Math.pow(10, 2);
					break;
				case "orange":
					sum *= Math.pow(10, 3);
					break;
				case "yellow":
					sum *= Math.pow(10, 4);
					break;
				case "green":
					sum *= Math.pow(10, 5);
					break;
				case "blue":
					sum *= Math.pow(10, 6);
					break;
				case "violet":
					sum *= Math.pow(10, 7);
					break;
				case "grey":
					sum *= Math.pow(10, 8);
					break;
				case "white":
					sum *= Math.pow(10, 9);
					break;

				}
			}
			if ( i == 0 ) sum *= 10;
			
		}
		
		System.out.println(sum);
	}
}
