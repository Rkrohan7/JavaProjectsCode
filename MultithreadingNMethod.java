class Mythread5 extends Thread {
	public void run() {
		int i = 0;
		while (i < 20) {
			System.out.println("I am in Mythread5 ");
			i++;

		}
	}
}

class Mythread6 extends Thread {
	public void run() {
		int i = 0;
		while (i < 20) {
			System.out.println("I am in Mythread6 ");
			i++;
		}
	}
}

public class MultithreadingNMethod {

	public static void main(String[] args) {
		Mythread5 t1 = new Mythread5();
		t1.setPriority(Thread.MIN_PRIORITY);
		System.out.println("before start:");
		System.out.println(t1.getState());
		t1.setName("Rohan");
		System.out.println(t1.getId());
		System.out.println(t1.getName());
		Mythread6 t2 = new Mythread6();
		t2.setPriority(Thread.MAX_PRIORITY);
		t2.setName("Sudeshi");
		System.out.println(t2.getId());
		System.out.println(t2.getName());
		t1.start();
		System.out.println(t1.isAlive());
		System.out.println("after start:");
		System.out.println(t1.getState());
		System.out.println(t2.getState());
		System.out.println(t1.getState());
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(t2.isDaemon());

	}

}
