package syncronizedExample;

public class AnonymousInnerClass {

	public static void main(String[] args) {
		Add a=new Add() {
		
			@Override
			public int Addition(int i, int j) {
				
				return i+j;
			}
			@Override
			public int substraction(int i, int j) {
				
				return i-j;
			}
		};
		System.out.println(a.Addition(4, 5));
		System.out.println(a.substraction(14, 5));

	}

}
interface Add{
 int Addition(int i , int j);
 int substraction(int i , int j);
}