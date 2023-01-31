package gettersetter;

public class Employee {
	private int a;
	private String name;
	
	public void show() {
		System.out.println("in employee class show method");
		System.out.println(this.a);
		System.out.println(this.name);
	}

	public static void main(String[] args) {
		Employee obj=new Employee();
//		obj.a=11;
//		obj.name="Rohan";
//		obj.show();

	}

	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
class Employee1{
	public static void main(String[] args) {
		Employee obj1=new Employee();
		obj1.setA(11);
		obj1.setName("Rohan");
		System.out.println(obj1.getName());
		System.out.println(obj1.getA());
		//obj1.show();
	}
	
}
