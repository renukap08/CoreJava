package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arraylist1 = new ArrayList<String>();
		
		arraylist1.add("Renu");     //index 0
		arraylist1.add("Bharath");  //index 1
		arraylist1.add("Darshu");   //index 2
		arraylist1.add("Divya");    //index 3
		arraylist1.add("Ruby");      //index 4
		
//Getting entire elements
		
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);

//Removing an element
		
		arraylist1.remove(3);
		System.out.println("The size of arraylist is " + arraylist1.size());
		System.out.println(arraylist1);
		
//Fetching particular element
		
		System.out.println("The element of index 2 is " + arraylist1.get(2));
		System.out.println(arraylist1);
		
//to replace the value at 1 position
		
		arraylist1.set(3, "Priya"); 
		
//Iterating through array list
		
//type 1 "for" loop example
		
		for(int i=0;i<arraylist1.size();i++) {
		System.out.println(arraylist1.get(i));
		}
		
//type 2 "for" loop example
		
		for(String name: arraylist1) {
		System.out.println(name);
		
		}
		
//type 3 "for" loop example
		
		Iterator<String> itr = arraylist1.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		}
		
//Sorting an arraylist
		
		Collections.sort(arraylist1);
		System.out.println(arraylist1);
		
//Sort in desc order
		
		Collections.reverse(arraylist1);
		System.out.println(arraylist1);
		
		/*for(int i=0;i<arraylist1.size()-1;i++);
		String[] a;
		{
			int i;
			System.out.println(a[i] + ",");
		}
		System.out.println(a[arraylist1 - 1]);*/
		}
	}
