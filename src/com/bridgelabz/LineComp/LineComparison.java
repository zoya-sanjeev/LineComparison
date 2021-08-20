package com.bridgelabz.LineComp;

public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x1 =Math.floor(Math.random()*10);
		double x2 =Math.floor(Math.random()*10);
		double y1 =Math.floor(Math.random()*10);
		double y2 =Math.floor(Math.random()*10);
		System.out.println("Length of line "+ Math.round(Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2))));

	}

}
