package org.cnt;

public class NestedForLoop {
	public static void main(String[] args) {
		//1            //2    //8
		for (int i = 0; i <2; i++) {
			//3            //4    //6
			for (int j = 0; j < 3; j++) {
				//5
				System.out.println(j);
			}
			//7
			System.out.println(i);
		}
		//   1     2    3     4     5     6
		//i=0     0<4  j=0  0<3  0(j)  j=0+1=1
		//             j=1  1<3  1(j)  J=1+1=2
		//             j=2  2<3  2(j)  J=2+1=3
		//             j=3  3<3 -----inner loop terminate 0(1) i=0+1=1 
		// i=1    1<2  j=0  0<3  0(j)  j=0+1=1
		}

}
