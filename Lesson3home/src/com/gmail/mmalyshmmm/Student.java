package com.gmail.mmalyshmmm;

public class Student extends Human {
	private String faculty;
	private String formOfStudy;

	public Student(String name, String surName, String middleName, String age, boolean sex, String faculty,
			String formOfStudy) {
		super(name, surName, middleName, age, sex);
		this.faculty = faculty;
		this.formOfStudy = formOfStudy;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String middleName, String surName, String age, boolean sex) {
		super(name, middleName, surName, age, sex);
		// TODO Auto-generated constructor stub
	}

	public String getFaculty() {
		return faculty;
	}
@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}
		Student other  = (Student) obj;
		 if ((this.getName() == null) ? (other.getName() != null) : !this.getName().equals(other.getName())) {
		        return false;
		    }
		 if ((this.getMiddleName() == null) ? (other.getMiddleName() != null) : !this.getMiddleName().equals(other.getMiddleName())) {
		        return false;
		    }
		 if ((this.getSurName() == null) ? (other.getSurName() != null) : !this.getSurName().equals(other.getSurName())) {
		        return false;
		    }
		 if ((this.getFaculty() == null) ? (other.getFaculty() != null) : !this.getFaculty().equals(other.getFaculty())) {
		        return false;
		    }
		 if ((this.getAge() == null) ? (other.getAge() != null) : !this.getAge().equals(other.getAge())) {
		        return false;
		    }
		 if ((this.getClass() == null) ? (other.getClass() != null) : !this.getClass().equals(other.getClass())) {
		        return false;
		    }

		    return true;
		
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}

	public String getFormOfStudy() {
		return formOfStudy;
	}

	public void setFormOfStudy(String formOfStudy) {
		this.formOfStudy = formOfStudy;
	}

	@Override
	public String toString() {
		return "Student [faculty=" + faculty + ", formOfStudy=" + formOfStudy + ", toString=" + super.toString() + "]";
	}

}
