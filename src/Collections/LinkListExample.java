package Collections;
import java.util.LinkedList;

public class LinkListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> list1 = new LinkedList<String>();
		
		list1.add("blue");
		list1.add("pink");
		list1.add("red");
		list1.add("yellow");
		list1.add("green");
		list1.addFirst("White");
		
		System.out.println(list1);
		
		for (int i=0;i<list1.size();i++) {
			
		System.out.println(list1.get(i));
		
		}
		
		list1.add(3,"Black");
        System.out.println(list1);
		
	}

}
