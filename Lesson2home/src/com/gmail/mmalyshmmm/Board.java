package com.gmail.mmalyshmmm;

import java.util.Arrays;

public class Board {
	private Shape [] figure = new Shape[4];

	public Board(Shape[] figure) {
		super();
		this.figure = figure;
	}

	public Board() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape[] getBoard() {
		return figure;
	}

	public void setBoard(Shape[] figure) {
		this.figure = figure;
	}

	public void inBoard(Shape fig, int i){
		if(i>=0 && i<figure.length && figure[i] == null ){
			figure[i] = fig;
		}else{
			System.out.println("Place on doard is filled or incorrect data");
		}
	}
	
	public void fromBoard(Shape fig, int i){
		if(i>0 && i<figure.length && figure[i] !=null){
			figure[i] = null;
		}else{
			System.out.println("In position "+i+" no figure");
		}
	}
	
	public double areaFigOnBoard(){
		double area = 0;
		System.out.println("Placed figures on board: ");
		for (int i = 0; i < figure.length; i++) {
			if(figure[i] != null){
				System.out.println(figure[i].getClass().getSimpleName());
				area += figure[i].getArea();
			}
		}
		System.out.println("Area of all figures = "+area);
		return area;
	}
	
	@Override
	public String toString() {
		return "Desk [figure=" + Arrays.toString(figure) + "]";
	}
	
}
