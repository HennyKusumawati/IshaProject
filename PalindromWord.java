package homework;

import java.util.Scanner;

public class PalindromWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromWord pal = new PalindromWord();
		System.out.println("Enter the input word: ");
		pal.PalindromChecker();
	}
	
	void PalindromChecker() {
		Scanner scanner = new Scanner(System.in);
		
		String input = scanner.nextLine();
		String stb = new StringBuilder(input).reverse().toString();
		 
		if (input.equalsIgnoreCase(stb)) {
			System.out.println("The input word is palindrom");
		} else {
			System.out.println("The input word is not palindrom");
		}
	}
}
