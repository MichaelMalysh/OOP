package FourthTask;

import java.util.Scanner;

public class PhoneTaskFourth {
	private int number;
	private String color;
	private String model;
	private String type;

	public int getNumber() {

		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public PhoneTaskFourth() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PhoneTaskFourth(int number, String color, String model, String type) {
		super();
		this.number = number;
		this.color = color;
		this.model = model;
		this.type = type;
	}

	public int registration() {
		int number = getNumber();
		return number;
	}

	public void call() {
		Scanner sc  = new Scanner(System.in);
		System.out.println("Input number:");
		System.out.print("+38095");
		int num = sc.nextInt();
		NetworkTaskFourth.searchNumber(num);

		sc.close();
	}
	

	@Override
	public String toString() {
		return "Phone [number=" + number + ", color=" + color + ", model=" + model + ", type=" + type + "]";
	}

}
