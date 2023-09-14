package org.det;

public class InternDetails {
	public void interns(String name,String department,int age) {
		System.out.println("Student Name:"+name);
		System.out.println("Which department:"+department);
		System.out.println("Student age:"+age);

	}
	public static void main(String[] args) {
		InternDetails i=new InternDetails();
		i.interns("Ramesh", "Software Testing", 25);
	}

}
