package org.cnt;

public class client1 {
	public static void main(String[] args) {
		int a=10,b=20,c=30;
		//10>20,10>30
		if (a>b && a>c) {
			System.out.println("A is greater");
			
		}
		//20>30,20>10
		else if (b>c && b>a) {
			System.out.println("B is greater");
		}
		//30>20,30>10
		else if (c>a && c>b) {
			System.out.println("C is greater");
		}
		else {
			System.out.println("All Condition is false");
		}
	}

}
