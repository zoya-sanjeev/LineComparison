package com.bridgelabz.LineComp;

public class Line {
	
	Point startPoint;
	Point endPoint;
	
	Line(Point start, Point end){
		this.startPoint=start;
		this.endPoint=end;
	}
	
	double getLengthOfLine(Point startPoint,Point endPoint) {
		
		double lengthOfLine= Math.sqrt(Math.pow(endPoint.getxCoordinate() -startPoint.getxCoordinate(), 2)+ Math.pow(endPoint.getyCoordinate() -startPoint.getyCoordinate(), 2));
		return lengthOfLine ;
		
	}
}
