package collectionDemopkg;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<>();
		ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(11,22,33,44,55));

		
		list1.add(10);
		list1.add(20);
		list1.add(30);
		list1.add(40);
		list1.add(60);
		list1.add(4 , 50);
		System.out.println(list1.size());
		System.out.println(list1);
		
		System.out.println("simple for loop");
		for(int i=0;i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		System.out.println(" for each loop");
		list1.forEach(a->{
			System.out.println(a);
		});
		System.out.println("enhance for loop");
		for(Integer i:list1) {
			System.out.println(i);
		}
	}

}
