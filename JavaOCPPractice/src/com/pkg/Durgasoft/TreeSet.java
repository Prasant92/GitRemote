package com.pkg.Durgasoft;

import java.util.Iterator;

public class TreeSet {

	public static void main(String[] args) {
		
		java.util.TreeSet<StringBuilder> ts=new java.util.TreeSet<StringBuilder>(new MyComp());
		ts.add(new StringBuilder("Arsenal"));
		ts.add(new StringBuilder("Man Utd"));
		ts.add(new StringBuilder("Man City"));
		ts.add(new StringBuilder("Spurs"));
		ts.add(new StringBuilder("Liverpool"));
		ts.add(new StringBuilder("Chelsea"));
		ts.add(new StringBuilder("West Ham"));
		ts.add(new StringBuilder("Leicester City"));
		System.out.println(ts);
		Iterator<StringBuilder> itr=ts.descendingIterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
