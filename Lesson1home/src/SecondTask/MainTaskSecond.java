package SecondTask;

public class MainTaskSecond {

	public static void main(String[] args) {
		TriangleTaskSecond trgOne = new TriangleTaskSecond(4.5, 2, 5);
		System.out.println(trgOne);
		System.out.println(trgOne.triangleArea());
		
		System.out.println();
		
		TriangleTaskSecond trgTwo = new TriangleTaskSecond();
		System.out.println("New Triangle");
		System.out.println(trgTwo.triangleArea(5, 4, 6));

	}

}
