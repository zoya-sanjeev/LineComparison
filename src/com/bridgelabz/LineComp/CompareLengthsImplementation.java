package com.bridgelabz.LineComp;

public class CompareLengthsImplementation implements CompareLengthsInterface{
	
	@Override
	public void equalityOfLines(double line1, double line2) {
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
	
	@Override
	public void compareLines(double line1, double line2) {
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
	
}
