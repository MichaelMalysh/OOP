package com.gmail.mmalyshmmm;

public class Circle extends Shape {
	private Point a;
	private Point b;

	public Circle(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Circle() {
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

		return 2 * getA().side(getB()) * Math.PI;
	}

	@Override
	double getArea() {

		return Math.PI * Math.pow(getA().side(getB()), 2);
	}

	@Override
	public String toString() {
		return "Circle [a=" + a + ", b=" + b + "]";
	}

}
