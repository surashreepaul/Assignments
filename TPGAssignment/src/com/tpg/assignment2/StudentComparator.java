package com.tpg.assignment2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparator {

	public static void main(String args[]) {
		Student s1 = new Student(33, "Tina", 3.6);
		Student s2 = new Student(85, "Louis", 3.85);
		Student s3 = new Student(56, "Samil", 3.75);
		Student s4 = new Student(19, "Samar", 3.75);
		Student s5 = new Student(22, "Lorry", 3.76);
		List<Student> listOfStudent = new ArrayList<Student>();
		listOfStudent.add(s1);
		listOfStudent.add(s2);
		listOfStudent.add(s3);
		listOfStudent.add(s4);
		listOfStudent.add(s5);

		System.out.println("Unsorted");
		for (int i = 0; i < listOfStudent.size(); i++)
			System.out.println(listOfStudent.get(i));

		Collections.sort(listOfStudent, new Student());

		System.out.println("After Sort");
		for (int i = 0; i < listOfStudent.size(); i++)
			System.out.println(listOfStudent.get(i));
	}
}
