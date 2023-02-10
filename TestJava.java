import java.util.Scanner;





//Handle ArrayIndexOutOfBoundException
//int a[5] = {1,2,3,4,5}; sout(a[6]);


class QuestionOne{
	int a[]= {1,2,3,4,5};
	public void ExceptionArray() {
		for(int i =0;i<a.length;i++)
		System.out.println(a[i]);
		try {
			System.out.println(a[6]);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println(e);
		}
	}
	
}



//. Age criteria for vaccine using exception handling
//Group 1
//Group 2 - 45 - 60 - eligible for vaccine
//Group 3


class QuestionTwo{
	
	
	
	
	public void elijibility(int age) {
		
		if(age>=45 && age<=60) {
			System.out.println(" Your are - eligible for vaccine");
		}else {
			try {
				if(age<45 || age>60) {
					System.out.println("Sorry!!! You are not elegible");
				}
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}



//movie ticket
//no of seats - 2 seats
//- bookTicket

class TicketBook{
public	void Book() {
		
	synchronized (TicketBook.class) {
		System.out.println(Thread.currentThread().getName()+"ticket book sussesfully!!!!!!!!!");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		
	}
		
	}
}
//bus ticket reservation
class BusTicket{
	public void booking() {
		synchronized (BusTicket.class) {
			System.out.println(Thread.currentThread().getName()+"Your Seat is booked!!!!!!!!!");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
	}
}
//Count the number of digits in given number
//5236 = 4
class CountNumber{
public void	Countno(int number) {
	   int count = 0;
	     
	  
	      while( number!=0){
	    	  number=  number/10;
	         count++;
	      }
	      System.out.println("Number of digits in the entered integer are :: "+count);

}
}
//Toggle the cases of String
//eg. CoDeKUL = cOdEkul
//- handle exception if string contains other than alphabets
//character
//- check whether given string is empty or not



public class TestJava {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Age to check elegible or not:");
		
		int age=sc.nextInt();
		 System.out.println("Enter a number ::");
		int number=sc.nextInt();
		
		
//Object creation..................................................
		QuestionOne q=new QuestionOne();
		QuestionTwo qt=new QuestionTwo();
		TicketBook tb=new TicketBook();
		BusTicket bt=new BusTicket();
		CountNumber cn=new CountNumber();
		
		q.ExceptionArray();
		qt.elijibility(age);
		cn.Countno(number);
//Question number three.........................................
		
		Thread t1 = new Thread(() -> {
			
			tb.Book();
			
            
			
		
		});
		t1.setName("User one - ");
		t1.start();

        
		Thread t2 = new Thread(() -> {
			
				tb.Book();
			
		});
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.setName("User Two - ");
		t2.start();
//Question number four.........................................
Thread t3 = new Thread(() -> {
			
			bt.booking();
			
            
			
		
		});
		t3.setName("Passenger One- ");
		t3.start();

        
		Thread t4 = new Thread(() -> {
			
				bt.booking();
			
		});
		t4.setName("Passenger Two - ");
		try {
			t4.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t4.start();
		
	}

}
