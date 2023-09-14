package org.cnt;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class WhileLoop {
	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<>();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		s.add(60); 
		s.add(70);
		s.add(80);
		s.add(90);
		s.add(10);
		s.add(20);
		Iterator<Integer> it = s.iterator();
		System.out.println("HashSet is:"+ s);
		while (it.hasNext()) {
			System.out.println("Iterated HashSet:"+ it);
		}
		
	}

}
