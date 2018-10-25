package com.gmail.mmalyshmmm;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.jws.soap.SOAPBinding;

public class Group implements Comparable {
	private Student[] group = new Student[10];
	private int countGroup = 0;

	public Group(Student[] group) {
		super();
		this.group = group;
	}

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student[] getGroup() {
		return group;
	}

	public void setGroup(Student[] group) {
		this.group = group;
	}

	public void addStudents(Student student) throws MyException {

		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = student;
				countGroup++;
				return;
			}
		}
		throw new MyException("You cant add more than 10 students");
	}

	public void interactiveAddStudents() throws MyException {
		Scanner sc = new Scanner(System.in);
		String age = "";
		boolean sex = false;
		String name = "";
		String middleName = "";
		String formOfStudy = "";
		String faculty = "";
		String surName = "";
		try {
			System.out.println("Name of student:");
			name = sc.nextLine();
			System.out.println("Surname of student:");
			surName = sc.nextLine();
			System.out.println("Middle name of student:");
			middleName = sc.nextLine();
			System.out.println("Age of student:");
			age = sc.nextLine();
			System.out.println("Faculty of student:");
			faculty = sc.nextLine();
			System.out.println("Form of study of student:");
			formOfStudy = sc.nextLine();
			System.out.println("Sex of student:");
			sex = sc.hasNext();
		} catch (InputMismatchException e) {
			System.out.println("Mistake in input");
		} finally {
			sc.close();
		}
		Student student = new Student(name, surName, middleName, age, sex, faculty, formOfStudy);
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = student;
				countGroup++;
				return;
			}
		}
	}

	public void deleteStudent(Student student) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null)
				if (group[i].equals(student)) {
					group[i] = null;
					countGroup--;
				}
		}

	}

	public Student[] findSurnameStudent(String surName) {

		Student[] student = new Student[countGroup];
		boolean test = false;
		try {
			for (int i = 0; i < group.length; i++) {
				if (group[i].getSurName().equals(surName)) {
					student[i] = group[i];
					test = true;
				}

			}
			if (test) {
				System.out.println(surName + " has found");
			} else {
				System.out.println(surName + " isn`t add");
			}
		} catch (NullPointerException e) {
			System.out.println("This student isn`t add");
		} catch (MyException e) {
			System.out.println("Student with surname" + surName + "not found");
		}
		return student;
	}

	public boolean compareTo(String a, String b) {
		int check = 0;
		try {
			check = a.compareTo(b);
		} catch (NullPointerException e) {
			check = 0;
		}
		return (check > 0) ? false : true;
	}

	@Override
	public int compareTo(Object o) {
		Group student = (Group) o;
		try {
			for (int i = 0; i < group.length; i++) {
				if (group[i].getSurName().equals(student)) {
					return 0;
				}
			}
		} catch (ClassCastException e) {
			return -1;
		}
		return 1;
	}

	public void sort() {
		Student temp;
		try {
			for (int i = 0; i < countGroup - 1; i++) {
				for (int j = 0; j < countGroup - i - 1; j++) {
					if (compareTo(group[i + 1].getSurName(), group[i].getSurName())) {
						temp = group[i];
						group[i] = group[i + 1];
						group[i + 1] = temp;
					}
				}
			}
		} catch (NullPointerException e) {
			System.out.println("Students wasn`t add");
		}

	}

	@Override
	public String toString() {
		String[] std = new String[countGroup];
		sort();
		try {
			for (int i = 0; i < countGroup; i++) {
				if (group[i] != null) {
					std[i] = group[i].getName() + " " + group[i].getMiddleName() + " " + group[i].getAge();
				}
			}
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return "Students in system " + countGroup + " " + Arrays.toString(std);
	}
}
