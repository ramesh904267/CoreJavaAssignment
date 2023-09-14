package org.cus;
//based on datatype
public class Customer {
	private void cusDetails(String name) {
		System.out.println("Customer Name:"+name);
		}
	private void cusDetails(int age,String address) {
		System.out.println("Customer phone:"+age);
		System.out.println("Customer Address:"+address);
	}
	private void cusDetails(float salary,long phNo) {
		System.out.println("Customer Salary:"+salary);
		System.out.println("Customer Salary:"+phNo);
	}
	public static void main(String[] args) {
		Customer c=new Customer();
		c.cusDetails("Ramesh");
		c.cusDetails(25,"Mumbai");
		c.cusDetails(25000f, 789456123l);
	}
}
