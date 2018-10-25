package com.gmail.mmalyshmmm;

public class Main {

	public static void main(String[] args) {
		
		Point p1 = new Point(1,1);
		Point p2 = new Point(2,3);
		Point p3 = new Point(3,1);
		Point p4 = new Point(1,3);
		
		Triangular tr = new Triangular(p1, p2, p3);
		Circle cir = new Circle(p1,p2);
		Square sq = new Square(p1,p4);
		Board board = new Board();
		
		System.out.println("Triangle Perimetr: "+tr.getPerimetr());
		System.out.println("Triangle Area: "+tr.getArea());
		System.out.println("Circle Perimetr: "+cir.getPerimetr());
		System.out.println("Circle Area: "+cir.getArea());
		System.out.println("Square Area: "+sq.getArea());
		System.out.println("Square Perimetr: "+sq.getPerimetr());
		
		System.out.println();
		
		Shape[] shapes = {tr,cir,sq, null};
		for (int i = 0; i < board.getBoard().length; i++) {
			board.inBoard(shapes[i], i);
		}
		board.areaFigOnBoard();
		
		System.out.println();
		
		for (int i = 0; i < board.getBoard().length; i++) {
			if(board.getBoard()[i]== cir){
				board.fromBoard(cir, i);
			}
		}
		
		board.areaFigOnBoard();

	}

}
