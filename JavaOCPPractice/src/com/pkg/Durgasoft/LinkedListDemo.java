package com.pkg.Durgasoft;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();
		ll.addFirst("Amit");
		ll.addFirst("Abhay");
		ll.addLast("Ram");
		ll.addLast("Surya");
		System.out.println(ll.getFirst());
		System.out.println(ll.getLast());
		ListIterator<String> ltr=ll.listIterator();
		while(ltr.hasNext())
		{
			ltr.previous();
			if(ll.contains("Amit"))
				continue;
			//ll.remove("Amit");  //ConcurrentModificationException
				System.out.println(ll);
		}
		System.out.println(ll);
	}

}
