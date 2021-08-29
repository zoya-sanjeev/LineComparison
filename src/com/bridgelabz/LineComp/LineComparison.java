package com.bridgelabz.LineComp;

import java.util.Scanner;

public class LineComparison {
	
	static Scanner sc=new Scanner(System.in);
	
	public static Point readPoint() {
		
		System.out.println("Enter X coordinate");
		double xCoordinate=sc.nextDouble();
		System.out.println("Enter Y coordinate");
		double yCoordinate=sc.nextDouble();
		Point point=new Point(xCoordinate,yCoordinate);
		return point;
		
	}
	public static void main(String[] args) {
		Point point1=readPoint();
		Point point2=readPoint();
		Point point3=readPoint();
		Point point4=readPoint();
		
		Line line1=new Line(point1,point2);
		Line line2=new Line(point3,point4);
		
		CompareLengthsInterface lengthComparison = new CompareLengthsImplementation();
		lengthComparison.equalityOfLines(LengthOfline1,LengthOfline2);
		lengthComparison.compareLines(LengthOfline1,LengthOfline2);
		
		
	}
	
	

}
