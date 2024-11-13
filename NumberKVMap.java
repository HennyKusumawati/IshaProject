package homework;

import java.util.HashMap;

//HW Nov 12.1. Program to count the number of key-value in Map
public class NumberKVMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();
		map.put("Chairs", 5);
		map.put("Table", 3);
		map.put("Desk", 7);
		map.put("Cabinet", 6);
		map.put("Dresser", 4);
		
		int count = map.size();
		System.out.println("The number of the key-value pair in the map is "+count);
	}
	
	
}
