package org.cnt;



public class BreakStatement {

	public static void main(String[] args) {
		
		for (int i = 0; i<=10; i++) {
			
			if (i==5) {
				//break;
				//continue;
				System.exit(i);
			}
			
			System.out.println(i);
		}
	System.out.println("End...");
		
	}
}
