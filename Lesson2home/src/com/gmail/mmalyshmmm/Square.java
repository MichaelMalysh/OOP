package com.gmail.mmalyshmmm;

public class Square extends Shape {
	private Point a;
	private Point b;

	public Square(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;

	}

	public Square() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}
	

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	@Override
	double getPerimetr() {

		return getA().side(getB()) * 4;
	}

	@Override
	double getArea() {

		return Math.pow(getA().side(getB()), 2);
	}

	@Override
	public String toString() {
		return "Square [a=" + a + ", b=" + b + "]";
	}



}
