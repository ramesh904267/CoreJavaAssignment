package org.cnt;

public class LoopingConditionFor {
	public static void main(String[] args) {
		     //1         //2    //3
		//for (int i = 0; i < 5; i++) {
		for (int i = 4; i >0; i--) {
			System.out.println(i);
		}
			
			//i=i+1
			
			//  1    2      3     4
			//i=0   0<5    0(1)   i=0+1=1 increment
	
			//i=1    1<5   1(1)   i=1+1=2
			//i=5    5<5  -loop condition is false
           //i=4   4>0    0(1)   i=4-1=3  decrement
		   //condition false
		}
	}

//}
