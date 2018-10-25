package com.gmail.mmalyshmmm;

public class Point {
	private double x;
	private double y;

	public Point(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	public Point() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double side(Point num) {
		return Math.sqrt(Math.pow(this.getX() - num.getX(), 2) + Math.pow(this.getY() - num.getY(), 2));
	}
	

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}
