package com.pkg.Durgasoft;

import java.util.Comparator;

public class MyComp implements Comparator<Object>{

	@Override
	public int compare(Object o1, Object o2) {
		
		StringBuilder sb1=(StringBuilder)o1;
		StringBuilder sb2=(StringBuilder)o2;
		String s1=sb1.toString();
		String s2=sb2.toString();
		return s1.compareTo(s2);
	}
}
