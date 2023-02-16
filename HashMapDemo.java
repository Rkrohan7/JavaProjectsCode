package collectionDemopkg;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map=new HashMap<>();
		map.put(1, "Rohan");
		map.put(2, "Abhi");
		map.put(3, "Vishwa");
		map.put(4, "Sandy");
		map.put(5, "Deva");
		HashMap<Integer, String> map1=new HashMap<>();
		map1.put(1, "Rohan Kadam");
		map1.put(2, "Abhi Mule");
		map1.put(3, "Vishwa Shinde");
		map1.put(4, "Sandy Gholap");
		map1.put(5, "Deva ");
		System.out.println(map.size());
		System.out.println(map.get(3));
		System.out.println(map);
		System.out.println(map.remove(5));
		System.out.println(map);
		System.out.println(map.containsKey(2));
		map.putAll(map1);
		System.out.println(map);
	
	for(Integer e:map.keySet()) {
		System.out.println(e+" "+map.get(e));
	}
	}

}
