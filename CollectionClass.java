package homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;

//HW Nov 12.2. Program to use 10 different method and their output in console (Hashmap, Hashtable, Linkedlist, Arraylist)

public class CollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//HashMap
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Banana", 15);
		map.put("Apple", 20);
		map.put("Kiwi", 17);
		System.out.println("1. Using Size Method: map.size() = " + map.size());				//1
		map.clear();
		System.out.println("2. Using Clear Method: map.clear() = "+map);					//2
		
		Hashtable<Integer, String> table = new Hashtable<>();
		table.put(5, "Tester");
		table.put(3, "Team Lead");
		table.put(4, "Manager");
		
		//System.out.println(table);
		table.replace(5, "Developer");
		System.out.println("3. Using Replace Method: table.replace(key,value) = "+table);	//3
		System.out.println("4. Using Get Method: table.get(objectKey) = "+ table.get(5));	//4
		
		
		LinkedList<String> listL = new LinkedList<>();
		listL.add("Milton");
		listL.add("Norcross");
		listL.add("Alpharetta");
		listL.add("Johns Creek");
		listL.remove(2);
		System.out.println("5. Using Remove Method: listL.remove(index) = "+ listL);		//5
		System.out.println("6. Using Peek Method: listL.peek() = "+listL.peek());			//6
		System.out.println("7. Using Element Method: listL.element() = "+listL.element());	//7
		//System.out.println(listL);
		
		ArrayList<String> arrayL = new ArrayList<>();
		arrayL.add("Georgia");
		arrayL.add("Virginia");
		arrayL.add("Texas");
		arrayL.add("Georgia");
		
		arrayL.set(2, "Florida");
		System.out.println("8. Using Set Method: arrayL.set(index, element) = "+arrayL); 	 //8
		System.out.println("9. Using lastIndexOf Method: arrayL.lastIndexOf(element) = "+arrayL.lastIndexOf("Georgia")); //9
		System.out.println("10. Using hashCode Method: arrayL.hashCode = "+arrayL.hashCode());							 //10
		
		
		
		
	}

}
