package homework;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//HW Nov 8.3 => Array the array numbers in the ascending order or descending order

public class ArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayNumbers obj = new ArrayNumbers();
		obj.ArraySorter();

	}

	void ArraySorter() {
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
		System.out.println("Ascending Array: "+ Arrays.toString(arrNum));
		System.out.println(arrNum);
	
		
		for(int i=arrNum.length-1; i>=0;  i--) {
			System.out.print(arrNum[i]+" ");
		}
		
	
		
		
	}
}
