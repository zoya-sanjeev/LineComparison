package com.bridgelabz.LineComp;

import java.util.Scanner;

public class LineComparison {
	static Scanner sc=new Scanner(System.in);
	
	public static Point readPoint(int number) {
		System.out.println("Enter X and Y coordinates of point"+number);
		double x1Coordinate=sc.nextDouble();
		double y1Coordinate=sc.nextDouble();
		Point point=new Point(x1Coordinate,y1Coordinate);
		return point;
	}
	
	public static double lineFromPoints(Point pointOne, Point pointTwo) {
		double line= Math.sqrt(Math.pow(pointTwo.xCoordinate -pointOne.xCoordinate, 2)+ Math.pow(pointTwo.yCoordinate -pointOne.yCoordinate, 2));
		return line;
	}
	
	public static void compareLines(double line1, double line2) {
		String lineOne= line1+"";
		String lineTwo= line2+"";
		System.out.println("Line one:"+lineOne);
		System.out.println("Line two:"+lineTwo);
		int compare= lineOne.compareTo(lineTwo);
		if(compare>0) {
			System.out.println("line 1 is greater than line 2");
		}
		else if(compare<0) 
			System.out.println("line 2 is greater than line 1");
		else
			System.out.println("line 1 is equal to line 2");
		
	}
	public static void equalityOfLines(double line1, double line2) {
		String lineOne= line1+"";
		String lineTwo= line2+"";
		System.out.println("Line one:"+lineOne);
		System.out.println("Line two:"+lineTwo);
		if(lineOne.equals(lineTwo)) {
			System.out.println("Line 1 is equal to Line 2");
		}
		else {
			System.out.println("Line 1 is not equal to Line 2");
		}
		
	}

	public static void main(String[] args) {
		
		Point point1=readPoint(1);
		Point point2=readPoint(2);
		Point point3=readPoint(3);
		Point point4=readPoint(4);
		
		double line1=lineFromPoints(point1,point2);
		double line2=lineFromPoints(point3,point4);
		
		System.out.println("Check for equality");
		equalityOfLines(line1, line2);
		System.out.println("Comparison of lines");
		compareLines(line1, line2);
		
		
	}

}
