package homework;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		System.out.println("Enter the number you want to check: ");
		ArmstrongNumber arm=new ArmstrongNumber();
		arm.armstrongChecker();

	}
	
	void armstrongChecker() {
		Scanner scanner = new Scanner(System.in);
		int input=scanner.nextInt();
		int originalInput=input;
		int result=0;
		int len=String.valueOf(input).length();
		
		for(; input!=0; input/=10) {
			int digit = input%10;
			result += Math.pow(digit,len);
		}
		 if(originalInput==result) {
			 System.out.println("The number you have entered is Armstrong Number");
		 } else {
			 System.out.println("The number you have entered is not Armstrong Number");
		 }
	}
}
