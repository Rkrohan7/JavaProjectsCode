package collectionDemopkg;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

class Laptop implements Comparable<Laptop>{
	
	@Override
	public String toString() {
		return "Laptop [code=" + code + ", brand=" + brand + ", price=" + price + ", getCode()=" + getCode()
				+ ", getBrand()=" + getBrand() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	public Laptop(int code, String brand, long price) {
		super();
		this.code = code;
		this.brand = brand;
		this.price = price;
	}
	int code;
	String brand;
	long price;
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the price
	 */
	public long getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(long price) {
		this.price = price;
	}
	@Override
	public int compareTo(Laptop o) {
		if(this.code>o.code) {
			return 1;
		}
		else if(this.code<o.code) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
}


public class ComparableDemo {

	public static void main(String[] args) {
		 ArrayList<Laptop> lp=new ArrayList<>();
		Laptop l1=new Laptop(201, "HP", 70000l);
		Laptop l2=new Laptop(301, "Lenove", 80000l);
		Laptop l3=new Laptop(101, "acer", 90000l);
		
		lp.add(l1);
		lp.add(l2);
		lp.add(l3);
		
		
		lp.forEach(System.out::println);
		
		System.out.println();
		Collections.sort(lp);
		lp.forEach(System.out::println);

	}

}
