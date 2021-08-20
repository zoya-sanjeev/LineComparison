package com.bridgelabz.LineComp;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 =Math.floor(Math.random()*10);
		double x2 =Math.floor(Math.random()*10);
		double y1 =Math.floor(Math.random()*10);
		double y2 =Math.floor(Math.random()*10);
		
		double a1 =Math.floor(Math.random()*10);
		double a2 =Math.floor(Math.random()*10);
		double b1 =Math.floor(Math.random()*10);
		double b2 =Math.floor(Math.random()*10);
		
		String l1=Long.toString(Math.round(Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2))));
		String l2=Long.toString(Math.round(Math.sqrt(Math.pow(a2-a1, 2)+ Math.pow(b2-b1, 2))));
		int compare= l1.compareTo(l2);
		if(compare>0) {
			System.out.println("line 1 is greater than line 2");
		}
		else if(compare<0) 
			System.out.println("line 2 is greater than line 1");
		else
			System.out.println("line 1 is equal to line 2");

	}

}
