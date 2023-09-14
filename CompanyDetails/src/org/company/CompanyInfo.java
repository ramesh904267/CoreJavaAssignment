package org.company;

public class CompanyInfo {
	private void companyName() {
		System.out.println("Ramesh");
}
	private void companyId() {
		System.out.println("1117");
}
   private void companyAddress() {
	System.out.println("Mumbai");

}
   public static void main(String[] args) {
	   CompanyInfo c=new CompanyInfo();
	   c.companyId();c.companyName();c.companyAddress();
}
}
