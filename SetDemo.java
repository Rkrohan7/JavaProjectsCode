import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		Set<Integer> s= new HashSet<>();
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(2);
		s.add(6);
		s.add(50);
		s.add(10);
		s.add(10);
		
		System.out.println(s);
		Set<Integer> s1= new LinkedHashSet<>();
		s1.add(20);
		s1.add(30);
		s1.add(40);
		s1.add(2);
		s1.add(6);
		s1.add(50);
		s1.add(10);
		
		System.out.println(s1);
		
		Set<Integer> s3= new TreeSet<>();
		s3.add(20);
		s3.add(30);
		s3.add(40);
		s3.add(2);
		s3.add(6);
		s3.add(50);
		s3.add(10);
		s3.add(10);
		System.out.println(s3);
	}

}
