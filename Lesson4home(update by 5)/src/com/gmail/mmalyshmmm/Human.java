package com.gmail.mmalyshmmm;

public class Human {
	private String name;
	private String surName;
	private String middleName;
	private int age;
	private boolean sex;



	public Human(String name, String surName, String middleName,int  age, boolean sex) {
		super();
		this.name = name;
		this.surName = surName;
		this.middleName = middleName;
		this.age = age;
		this.sex = sex;
	}

	public Human() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	
	

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Human [name=" + name + ", surName=" + surName + ", middleName=" + middleName + ", age=" + age + ", sex="
				+ sex + "]";
	}

	public boolean equals(Object std) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
