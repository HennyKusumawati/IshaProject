package homework;

public class ReverseANumber {

	public static void main(String[] args) {
		
		String number = "120334";
		StringBuilder str= new StringBuilder(number);
		System.out.println(str.reverse().toString());
 
		int num = 120334;
		StringBuilder st= new StringBuilder(String.valueOf(num));
		System.out.println(st.reverse());
 
 
		
	}

}
