package com.bridgelabz.LineComp;

import java.util.Scanner;

public class Point {
	private double xCoordinate;
	private double yCoordinate;
	
	static Scanner sc=new Scanner(System.in);
	
	Point(double xCoordinate, double yCoordinate){
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
 

}
