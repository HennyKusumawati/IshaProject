package homework;

import java.util.Iterator;
import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		PrimeNumber prm=new PrimeNumber();
		prm.PrimeNumChecker();
		

	}
	
	void PrimeNumChecker() {
	Scanner scanner=new Scanner(System.in);
	System.out.println("Input number : ");
	int input=scanner.nextInt();
	boolean isPrime=true;
	if(input>1) {
		for(int i=2; i<=input; i++) {
			if(input%2==0) {
				isPrime=false;
				break;
			}
			
		}
			
		}else {
			isPrime=false;
		} System.out.println("Input number "+input+" is Prime number? : "+isPrime);
	}
	
	
}
