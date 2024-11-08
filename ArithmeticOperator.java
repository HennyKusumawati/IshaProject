package homework;

public class ArithmeticOperator {
	
	void simpleMath(int a, int b) {
		
		System.out.println("Addition = "+ (a+b));
		System.out.println("Subtraction = "+ (a-b));
		System.out.println("Multiplication = "+ (a*b));
		System.out.println("Division = "+ (a/b));
		System.out.println("Modulus = "+ (a%b));
		
		
		
	}

	public static void main(String[] args) {
		ArithmeticOperator ao = new ArithmeticOperator();
		ao.simpleMath(20,10);
		
	}

}
