package com.bridgelabz.LineComp;

public class CompareLengthsImplementation implements CompareLengthsInterface{
	
	@Override
	public void equalityOfLines(Line line1, Line line2) {
		Double lengthOfLine1=line1.getLengthOfLine();
		Double lengthOfLine2=line2.getLengthOfLine();
		System.out.println("Line one:"+lengthOfLine1);
		System.out.println("Line two:"+lengthOfLine2);
		if(lengthOfLine1.equals(lengthOfLine2)) {
			System.out.println("Line 1 is equal to Line 2");
		}
		else {
			System.out.println("Line 1 is not equal to Line 2");
		}
		
	}
	
	@Override
	public void compareLines(Line line1, Line line2) {
		Double lengthOfLine1=line1.getLengthOfLine();
		Double lengthOfLine2=line2.getLengthOfLine();
		System.out.println("Line one:"+lengthOfLine1);
		System.out.println("Line two:"+lengthOfLine2);
		int compare= lengthOfLine1.compareTo(lengthOfLine2);
		if(compare>0) {
			System.out.println("line 1 is greater than line 2");
		}
		else if(compare<0) 
			System.out.println("line 2 is greater than line 1");
		else
			System.out.println("line 1 is equal to line 2");
		
	}
	
}
