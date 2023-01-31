package syncronizedExample;

public class DeadlockDemo {

	public static void main(String[] args) {
		 String res1="Printer";
	        String res2="Scanner";

	        Thread t1=new Thread(()->{
	            synchronized (res1){
	                System.out.println(Thread.currentThread().getName()+" Locked"+" "+res1);
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    System.out.println(e);
	                }}
	                synchronized (res2){
	                    System.out.println(Thread.currentThread().getName()+" Locked"+" "+res2);
	                }

	        });
	        Thread t2=new Thread(()->{
	            synchronized (res2){
	                System.out.println(Thread.currentThread().getName()+" Locked"+" "+res2);
	                try {
	                    Thread.sleep(100);
	                } catch (InterruptedException e) {
	                    System.out.println(e);
	                }
	                synchronized (res1){
	                    System.out.println(Thread.currentThread().getName()+" Locked"+" "+res1);
	                }
	            }
	        });

	        t1.setName("Laptop");
	        t2.setName("Desktop");
	        t1.start();
	        t2.start();

	}

}
