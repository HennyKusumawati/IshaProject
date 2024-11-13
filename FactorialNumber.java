package homework;

import java.util.Scanner;

//HW Nov 8.2. Find the factorial of a number
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FactorialNumber factor = new FactorialNumber();
		factor.FactorialOfNum();

	}
	
	void FactorialOfNum() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		int result = 1;
		for(int i=1; i <=number; i++) {
			result *=i;
		} System.out.println("The Factorial Number of "+ number+ " is : "+ result);
	}

}
