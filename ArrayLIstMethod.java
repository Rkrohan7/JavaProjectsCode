package collectionDemopkg;

import java.util.ArrayList;

public class ArrayLIstMethod {

	public static void main(String[] args) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(10);
		
		list1.add(20);
		
		list1.add(30);

		list1.add(40);

		list1.add(50);

		list1.add(60);

		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(110);
		
		list2.add(120);
		
		list2.add(130);

		list2.add(140);

		list2.add(150);

		list2.add(160);
 System.out.println(list1);
 System.out.println(list1.contains(10));
 System.out.println(list1.addAll(list2));
 
	}

}
