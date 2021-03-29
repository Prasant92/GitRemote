package com.pkg.Durgasoft;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Object> st=new Stack<>();
		st.push("A");
		st.push(10);
		st.push(new StringBuilder("String"));
		System.out.println(st); //[A,10,String]
		System.out.println(st.peek()); //String
		System.out.println(st.pop()); //String
		System.out.println(st); //[A,10]
		System.out.println(st.empty()); //false
		System.out.println(st.search("A"));  //returns the offset
		System.out.println(st.search("B"));  //-1
		
		Enumeration<Object> e=st.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
	}
}