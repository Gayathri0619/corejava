package com.siiet.arraylistdemo;
import java.util.ArrayList;
import java.util.Iterator;

public class Testgenerics {
	public static void main(String[] args) {
		
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("gaay");
		al.add("siri");
		al.add("geechu");
		
		//al.add(6);
		System.out.println("elements "+al);
		
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());

}
}
}