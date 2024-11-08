package homework;

import java.util.Iterator;

public class CountVowelInString {

	public static void main(String[] args) {
		String str="I am new to Java";
	CountVowelInString obj = new CountVowelInString();
	obj.countVowels(str);

	}
	
	void countVowels(String str) {
		
		//Array => We will be able to store the same data type
		//         We will be having the fixed length
		char[]ch= str.toCharArray();
		
		int counter=0;
		for (char c:ch) {
			if(c=='a'||c=='i'||c=='u'||c=='e'||c=='o'||c=='A'||c=='I'||c=='U'||c=='E'||c=='O') {
				counter++;
			}
			
		}	System.out.println("We have "+ counter + " vowel in the String "+ str);
		
		
	}

}
