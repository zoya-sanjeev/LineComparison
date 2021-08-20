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
		if(l1.equals(l2)) {
			System.out.println("The Lines are equal");
		}
		else
				System.out.println("The Lines are not equal");

	}

}
