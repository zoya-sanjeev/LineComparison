package com.bridgelabz.LineComp;

import java.util.Scanner;

public class LineComparison {
	

	public static void main(String[] args) {
		
		Point point1=new Point();
		Point point2=new Point();
		Point point3=new Point();
		Point point4=new Point();
		
		double LengthOfline1=point1.getLengthOfLine(point2);
		double LengthOfline2=point3.getLengthOfLine(point4);
		
		CompareLengthsInterface lengthComparison = new CompareLengthsImplementation();
		lengthComparison.equalityOfLines(LengthOfline1,LengthOfline2);
		lengthComparison.compareLines(LengthOfline1,LengthOfline2);
		
		
	}

}
