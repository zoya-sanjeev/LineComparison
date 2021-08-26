package com.bridgelabz.LineComp;

import java.util.Scanner;

public class Point {
	private double xCoordinate;
	private double yCoordinate;
	
	static Scanner sc=new Scanner(System.in);
	
	Point(){
		System.out.println("Enter X and Y coordinates of point");
		double xCoordinate=sc.nextDouble();
		double yCoordinate=sc.nextDouble();
		this.xCoordinate=xCoordinate;
		this.yCoordinate=yCoordinate;
	}

	public double getxCoordinate() {
		return xCoordinate;
	}

	public void setxCoordinate(double xCoordinate) {
		this.xCoordinate = xCoordinate;
	}

	public double getyCoordinate() {
		return yCoordinate;
	}

	public void setyCoordinate(double yCoordinate) {
		this.yCoordinate = yCoordinate;
	}
 
	
	public double getLengthOfLine( Point endPoint) {
		double lengthOfLine= Math.sqrt(Math.pow(endPoint.getxCoordinate() -this.getxCoordinate(), 2)+ Math.pow(endPoint.getyCoordinate() -this.getyCoordinate(), 2));
		return lengthOfLine ;
		
	}

}
