package com.pkg.Durgasoft;

public class TreeMap {

	public static void main(String[] args) {
		
		java.util.TreeMap<StringBuilder, String> tm=new java.util.TreeMap<StringBuilder, String>(new MyComp());
		tm.put(new StringBuilder("India"), "New Delhi");
		tm.put(new StringBuilder("Pakistan"), "Islamabad");
		tm.put(new StringBuilder("Indonesia"), "Jakarta");
		tm.put(new StringBuilder("Malaysia"), "Kualalampur");
		tm.put(new StringBuilder("China"), "Beijing");
		tm.put(new StringBuilder("Iran"), "Tehran");
		tm.put(new StringBuilder("Nepal"), "Kathmandu");
		tm.put(new StringBuilder("South Korea"), "Seoul");
		tm.put(new StringBuilder("North Korea"), "Pyongyang");
		tm.put(new StringBuilder("Turkey"), "Ankara");
		tm.put(new StringBuilder("Turkey"), "Ankara");
		System.out.println(tm);
		System.out.println(tm.entrySet());
		System.out.println(tm.keySet());
		System.out.println(tm.floorKey(new StringBuilder("Turkey")));
	}
}