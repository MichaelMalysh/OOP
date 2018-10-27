package com.gmail.mmalyshmmm;

import java.util.Comparator;

public class StudentComparator implements Comparator {
	private int parametr = 0;
	private boolean follow = false;

	public StudentComparator(int parametr, boolean follow) {
		super();
		this.parametr = parametr;
		this.follow = follow;
	}
	
	public StudentComparator(int parametr) {
		super();
		this.parametr = parametr;
	}

	public void setParametr(int parametr) {
		this.parametr = parametr;
	}

	public boolean isFollow() {
		return follow;
	}

	public void setFollow(boolean follow) {
		this.follow = follow;
	}

	@Override
	public int compare(Object o1, Object o2) {
		int n = 1;
		if (follow) {
			n = -1;
		}

		if (o1 != null && o2 != null) {
			return 1;
		}
		if (o1 == null && o2 != null) {
			return -1;
		}
		Student stdOne = (Student) o1;
		Student stdTwo = (Student) o2;
		switch (parametr) {
		case 0:
			return (stdOne.getName().compareTo(stdTwo.getName())) * n;
		case 1:
			return (stdOne.getSurName().compareTo(stdTwo.getSurName())) * n;
		case 2:
			return (stdOne.getMiddleName().compareTo(stdTwo.getMiddleName())) * n;
		case 3:
			return (stdOne.getAge().compareTo(stdTwo.getAge())) * n;
		case 4:
			return (stdOne.isSex() ? 1 : -1) * n;
		case 5:
			return (stdOne.getFaculty().compareTo(stdTwo.getFaculty())) * n;
		case 6:
			return (stdOne.getFormOfStudy().compareTo(stdTwo.getFormOfStudy())) * n;
		}
		return 0;

	}

}
