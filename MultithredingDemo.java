
class Mythread1 extends Thread{
	public void run() {
		int i=0;
		while(i<20000) {
			System.out.println("I am in Mythread1 ");
			i++;
			
		}
	}
}
class Mythread2 extends Thread{
	public void run() {
		int i=0;
		while(i<20000) {
			System.out.println("I am in Mythread2 ");
			i++;
		}
	}
}
public class MultithredingDemo {

	public static void main(String[] args) {
		Mythread1 mt1=new Mythread1();
		Mythread2 mt2=new Mythread2();
		mt1.start();
mt2.start();
	}

}
