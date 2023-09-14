package org.edu;

public class Arts extends Education {
	@Override
	public void ug(String department) {
		
		System.out.println("Which department:"+department);
	}
	@Override
	public void pg(int Student) {
		System.out.println("Number of Student:"+Student);
	}
    public void be() {
		System.out.println("Mechanical Engineer");

	}
    public void bEd() {
		System.out.println("Education");
	}
    public void bA() {
		System.out.println("English");

	}
    public void bBA() {
		System.out.println("Management");
	}
    public static void main(String[] args) {
    	Arts a=new Arts();
    	a.ug("MBA");a.pg(55);
    	a.be();a.bA();a.bBA();a.bEd();
	}
}
