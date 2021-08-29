package com.bridgelabz.LineComp;

public class Line {
	
	Point startPoint;
	Point endPoint;
	
	Line(Point start, Point end){
		this.startPoint=start;
		this.endPoint=end;
	}
	
	double getLengthOfLine() {
		
		double lengthOfLine= Math.sqrt(Math.pow(this.endPoint.getxCoordinate() -this.startPoint.getxCoordinate(), 2)+ Math.pow(this.endPoint.getyCoordinate() -this.startPoint.getyCoordinate(), 2));
		return lengthOfLine ;
		
	}
}
