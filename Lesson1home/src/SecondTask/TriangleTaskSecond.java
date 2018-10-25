package SecondTask;

public class TriangleTaskSecond {
	private double a;
	private double b;
	private double c;
	

	public TriangleTaskSecond(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public TriangleTaskSecond() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	public double triangleArea(){
		double result = 0;
		double p = (this.a+this.b+this.c)/2;
		
		result = Math.sqrt(p*(p-this.a)*(p-this.b)*(p-this.c));		
		
		return result;
	}
	public double triangleArea(double a, double b, double c){
		double result = 0;
		double p = (a+b+c)/2;
		
		result = Math.sqrt(p*(p-a)*(p-b)*(p-c));		
		
		return result;
	}

	@Override
	public String toString() {
		return "Triangle [a=" + a + ", b=" + b + ", c=" + c + "]";
	}
	
}
