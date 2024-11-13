package homework;

import java.util.Arrays;
import java.util.Scanner;

//HW Nov 8.4 => Find the largest of the Array value (taking input from user)
public class ArraysLargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArraysLargestValue.arrayMaxNum();
	}
	
	
		static void arrayMaxNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int firstNum = scanner.nextInt();
		System.out.println("Enter second number: ");
		int secondNum = scanner.nextInt();
		System.out.println("Enter third number: ");
		int thirdNum = scanner.nextInt();
		System.out.println("Enter fourth number: ");
		int fourthNum = scanner.nextInt();
		System.out.println("Enter fifth number: ");
		int fifthNum = scanner.nextInt();
		
		int[]arrNum= {firstNum,secondNum,thirdNum,fourthNum,fifthNum};
	    Arrays.sort(arrNum);
	    System.out.println("The largest number of the arrays is "+ arrNum[arrNum.length-1]);
	    
	}

}
