package homework;

public class StringAndMathMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAndMathMethod objStr=new StringAndMathMethod();
		StringAndMathMethod objMath=new StringAndMathMethod(10,5);

	}
	
	StringAndMathMethod(){
		String a = "Java is a Programming Language";
		String b = "I study Java Language";
	//	StringBuffer sb=new StringBuffer(a);
	//	CharSequence cs=sb;
		
		System.out.println(a.startsWith("Java"));				//1
		System.out.println(a.isBlank());						//2
		System.out.println(b.isEmpty());						//3
		System.out.println(a.matches(b));						//4
		System.out.println(a.replace('a','y'));					//5
		System.out.println(a.endsWith("Age"));					//6
		System.out.println(a.replaceAll("Java", "C#"));			//7
		System.out.println(a.lastIndexOf(a));					//8
		System.out.println(b.charAt(0));						//9
		System.out.println(a.contains("Java"));					//10
		System.out.println(a.compareToIgnoreCase(b));			//11
		System.out.println(a.toCharArray());					//12
		System.out.println("13 = "+ b.codePointAt(0));			//13
		String[] str= a.split(" ");
		System.out.println("14 = "+ str.clone().equals(a));		//14
		System.out.println(a.intern());							//15
		System.out.println(a.lastIndexOf(a));					//16
		char ch[]=a.toCharArray();								//17
		System.out.println("17 = "+ ch[4]);								//18
		System.out.println("18 = "+ ch[5]);								//19
		System.out.println("19 = "+ a.repeat(3));						//20
		System.out.println("20 = "+ a.strip());
		//System.out.println(a.);
	//	System.out.println(a.contentEquals("Java"));
		
		System.out.println("==========================================");
	}
	
	StringAndMathMethod(int m,int n){
		System.out.println("The substraction result is "+ Math.subtractExact(m, n));
		System.out.println("The division result is "+Math.divideExact(m, n));
		System.out.println(Math.ceilMod(m, n));
		System.out.println(Math.floorMod(m, n));
		System.out.println(Math.multiplyExact(m, n));
		System.out.println(Math.addExact(m, n));
		
	}

}
