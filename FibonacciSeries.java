package homework;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		System.out.println("Enter the fibonacci number you want to print: ");
		FibonacciSeries fb=new FibonacciSeries();
		fb.FibonacciPrint();

	}

	void FibonacciPrint() {
		int x,y,z;
		x=0;
		y=1;
		Scanner scanner = new Scanner(System.in);
		int input=scanner.nextInt();
		
		System.out.print(input+ " Fibonacci Number = ");
		for(int i=0; i<input; i++) {
			System.out.print(x+" ");
			z=x+y;
			x=y;
			y=z;
		}
		
	}
}
