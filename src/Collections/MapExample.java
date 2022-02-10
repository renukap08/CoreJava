package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	HashMap<Integer,String> map1 = new HashMap<Integer,String>();
		
		map1.put(10, "Adam");
		map1.put(12, "Bob");
		map1.put(15, "Jack");
		map1.put(22, "John");
		
		System.out.println(map1);
		
//Update a data in map
		
		map1.put(15, "Jill");
		System.out.println(map1);
		
//Deleting an entry
		
		map1.remove(12);
		System.out.println(map1);
		
		System.out.println(map1.get(3));
		
		for(Map.Entry<Integer, String> entry1 : map1.entrySet()) {
            
            System.out.println(entry1.getKey());
            System.out.println(entry1.getValue());
        }
        
        for(Integer val: map1.keySet() ) {
            
            System.out.println("Key is " + val);
            System.out.println("Value is " + map1.get(val));
        }
        
        for(String val : map1.values()) {
            
            System.out.println("Value is " + val);
        }

		
//LinkedHashMap
		
        LinkedHashMap<Integer,String> map2 = new LinkedHashMap<Integer,String>();
		
		map2.put(10, "Adam");
		map2.put(12, "Bob");
		map2.put(15, "Jack");
		map2.put(22, "John");
		
		System.out.println(map2);
		
//TreeMap
		
		TreeMap<Integer,String> map3 = new TreeMap<Integer,String>();
		
		map3.put(10, "Adam");
		map3.put(12, "Bob");
		map3.put(15, "Jack");
		map3.put(22, "John");
		
		System.out.println(map3); 
		
		
//Count the number of repeated words in a string
		
		String str1 = "Clean India Green India Love India";
		String[] words=str1.split(" ");
		int count=1;    //Variable for getting Repeated word count
	      
	      for(int i=0;i<words.length;i++) //Outer loop for Comparison       
	      {
	         for(int j=i+1;j<words.length;j++) //Inner loop for Comparison
	         {
	            
	         if(words[i].equals(words[j]))  //Checking for both strings are equal
	            {
	               count=count+1;    //if equal increment the count
	               words[j]="0"; //Replace repeated words by zero
	}
	         }
	         if(words[i]!="0")
	             System.out.println(words[i]+"-"+count); //Printing the word along with count
	             count=1;
}
	}
}