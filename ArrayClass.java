package homework;

import java.util.Arrays;

public class ArrayClass {

	public static void main(String[] args) {
		ArrayClass obj = new ArrayClass();
		obj.AverageValue();
		obj.MaxValue();
		obj.MaxValueArr();
		obj.MinValue();
		obj.SumValue();
		
	}

	void AverageValue() {
		int[]arr = {10,20,30,40,50};
		int sum=0;
		for(int a:arr) {
		sum=sum+a;
		
		}
		System.out.println("The Average of the array is : "+sum/arr.length);
	}
	
	void MaxValue() {
		int[]arr= {1,2,3,4,5,6,7};
		int largest=0;
		for(int num : arr) {
			if(largest<num) {
				largest=num;
			}
			
		}System.out.println("The Max number of the array is :" + largest);
	}
	
	void MaxValueArr() {
		int[]arr= {1,2,3,4,5,6,7};
		Arrays.sort(arr);
		System.out.println("The Maximum number of the array is: "+arr[arr.length-1]);
	}
	
	void MinValue() {
		int[]arr= {1,2,3,4,5,6,7};
		Arrays.sort(arr);
		
		System.out.println("The Min number of the array is :" + arr[0]);	
		}
	
	
	void SumValue() {
		int[]arr = {10,20,30,40,50};
		int sum=0;
		
		for(int num:arr) {
			sum=sum+num;
		}
		System.out.println("The Sum of the array is: "+ sum);
	}
}
