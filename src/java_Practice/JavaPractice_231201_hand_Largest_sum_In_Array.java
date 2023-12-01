package java_Practice;

//	Given an integer array nums,
//	find the contiguous subarray (containing at least one number)
//	which has the largest sum and return its sum.
//	
//	A subarray is a contiguous part of an array.
//	
//	Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//	Output: 6
//	Explanation: [4,-1,2,1] has the largest sum = 6.

public class JavaPractice_231201_hand_Largest_sum_In_Array {
	
	public static void main(String[] args) {
		
		int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
		
		int sum = 0;
		
		for ( int i = 0; i < nums.length; i++ ) {
			int result = 0;
			
			for ( int j = 0; j < nums.length - i; j++ ) {	
				
				for ( int k = 0+j; k <= j+i; k++ ) {
					if ( nums.length <= k ) break;
					result += nums[k];
					System.out.println("result : " + nums[k]);
					
				}
				
				if ( result > sum ) {
					sum = result; 
					System.out.printf("sum : %d\n", sum);
					result = 0;
				}else {
					System.out.printf("더 작거나 같아요 : %d\n",result);
					result = 0;
				}
				
			}
			
			
		}
		
		System.out.println(sum);
		
		
	}
}
