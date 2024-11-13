package homework;

import java.util.Arrays;
import java.util.Scanner;

//HW Nov 8.1. Check whether String is Anagram
public class AnagramWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnagramWord obj = new AnagramWord();
		obj.anagramChecker();

	}
	
	void anagramChecker() {
		System.out.println("Enter the first word: ");
		Scanner scan = new Scanner(System.in);
		String input1 = scan.nextLine().toLowerCase();
		char [] words1 = input1.toCharArray();
		
		System.out.println("Enter the second word: ");
		String input2 = scan.nextLine().toLowerCase();
		char [] words2 = input2.toCharArray();
		Arrays.sort(words1);
		Arrays.sort(words2);
		
		if(Arrays.equals(words1, words2)) {
			System.out.println("Both input are anagram");
		} else {System.out.println("Both input are not anagram");}
		
		
		
	}

}
