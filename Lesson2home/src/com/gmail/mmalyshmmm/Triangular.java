package com.gmail.mmalyshmmm;

public class Triangular extends Shape {
	private Point a;
	private Point b;
	private Point c;

	public Triangular(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangular() {
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

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	@Override
	double getPerimetr() {
		return this.getA().side(getB())+this.getB().side(getC())+this.getC().side(getA());
	}

	@Override
	double getArea() {
		double halfpr = getPerimetr()/2;
		return Math.sqrt(halfpr*(halfpr-getA().side(getB()))*(halfpr-getB().side(getC()))*(halfpr-getC().side(getA())));
	}

}
