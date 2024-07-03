package com.siiet.scannerclass;

import java.util.Scanner;

public class Personexe {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		System.out.println("enter person name");
		String name=sc.nextLine();
		System.out.println("enter pereson income");
		int income=sc.nextInt();
		  Person pp=new Person();
		  pp.setName(name);
		  pp.setIncome(income);
		  Taxcalculation t=new Taxcalculation();
		  t.calculationtax(pp);
		  System.out.println("after modificcation");
		  System.out.println(pp);
		

	}

}
