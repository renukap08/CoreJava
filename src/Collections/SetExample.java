package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//HashSet
		
		HashSet<String> set1 = new HashSet<String>();
		
		set1.add("India");
		set1.add("Canada");
		set1.add("USA");
		set1.add("Mexico");
		set1.add(null);
		
		System.out.println(set1);
		
//LinkedHashSet

		LinkedHashSet<String> set2 = new LinkedHashSet<String>();
		
		set2.add("India");
		set2.add("Canada");
		set2.add("USA");
		set2.add("Mexico");
		set2.add(null);
		
		System.out.println(set2);

//TreeSet
		
		TreeSet<String> set3 = new TreeSet<String>();
		
		set3.add("India");
		set3.add("Canada");
		set3.add("USA");
		set3.add("Mexico");
		//set3.add(null);       TreeSet cannot have null
		
		System.out.println(set3); 
		
//Removing duplicates from String
		
		String str1 = "Clean World Green World";  
		
        HashSet<String> hs1 = new HashSet<String>();
        for (String word : str1.split(" ")) {
            hs1.add(word);
        }
        System.out.println(hs1);
    }
			
	}
