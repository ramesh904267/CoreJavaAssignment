package org.emp;

public class Employee {
	private void empId() {
		
		System.out.println("1117");
}
     private void empName() {
		System.out.println("Ramesh");
}
	private void empDoB() {
		System.out.println("09/12/1997");
}
	private void empPhoneNumber() {
		System.out.println("789456123");

	}
	private void empEmail() {
		System.out.println("ramesh904267@gmail.com");

	}
	private void empAddress() {
		System.out.println("Mumabi");
}
	public static void main(String[] args) {
		//className object = new ClassName;
		Employee e=new Employee();
		e.empId();e.empAddress();
		e.empName();e.empDoB();e.empPhoneNumber();e.empEmail();
	}
}
