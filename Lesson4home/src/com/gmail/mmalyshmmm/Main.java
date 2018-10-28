package com.gmail.mmalyshmmm;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student("Lesya", "Vladislavovna", "Stepanenko", 18, false, "poetessa", "denna");
		Student s3 = new Student("Olya", "Oleksandrivna", "Tkachenko", 20, false, "shestidisuatniza", "zaochna");
		Student s2 = new Student("Anton", "Dariyovich", "Goncharenko", 19, true, "IITvE", "denna");
		Student s4 = new Student("Petro", "Vladislavovich", "Chubenko", 19, true, "IITvE", "zaochna");
		Student s5 = new Student("Vadim", "Stepanovich", "Leschenko", 17, true, "IITvE", "denna");
		Student s6 = new Student("Olesya", "Dmitrivna", "Plyshchenko", 18, false, "IITvE", "zaochna");
		Student s7 = new Student("Misha", "Igorovich", "Pavlovich", 18, true, "IITvE", "denna");
		Student s8 = new Student("Dmitriy", "Petrov", "Krivenko", 16, true, "IITvE", "zaochna");
		Student s9 = new Student("Irina", "Stepanovna", "Pavlenko", 21, false, "IITvE", "denna");
		Student s10 = new Student("Anna", "Ivanovna", "Stepanenko", 20, false, "IITvE", "zaochna");
		Student s11 = new Student("Igor", "Olegovich", "Dobriyvechir", 19, true, "IITvE", "denna");
		Group g1 = new Group();
		
		g1.addStudents(s1);
		//g1.interactiveAddStudents();
		g1.addStudents(s2);
		g1.addStudents(s3);
		g1.addStudents(s4);
		g1.addStudents(s5);
		g1.addStudents(s6);
		g1.addStudents(s7);
		g1.addStudents(s8);
		g1.addStudents(s9);
		g1.addStudents(s10);

	System.out.println(g1);
	g1.sortByParametr(3);
	System.out.println(g1);

	System.out.println();
	
	Student[] arrRecrute = g1.getRecrute();
	for (Student student : arrRecrute) {
		System.out.println("You were drafted into the army "+student.getName()+" "+student.getSurName());
	}
	}

}
