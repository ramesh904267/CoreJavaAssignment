package org.car;

public class Skoda {
	public void price(int Amount) {
		System.out.println("Car Price:"+Amount);

	}
	public void model(String name) {
		System.out.println("Car Model:"+name);
	}
public static void main(String[] args) {
	Skoda s=new Skoda();
	s.model("Honda");
	s.price(5000000);
}
}
