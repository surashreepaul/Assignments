package com.tpg.assignment2;

import java.util.Comparator;

public class Student implements Comparator<Student> {

	public int id;
	public String name;
	public double gpa;
	
	public Student(){
		
	}

	public Student(int id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return gpa;
	}
	
	  public String toString() {
          return this.id + " " + this.name + " " + this.gpa;
   }

	public int compare(Student st2, Student st1) {
		if (st1.getGpa() != st2.getGpa())
			return (st1.getGpa() - st2.getGpa()) > 0.0 ? 1 : -1;
		else if (!(st1.getName().equals(st2.getName())))
			return -(st1.getName().compareTo(st2.getName()));
		else
			return -(st1.getId() - st2.getId());
	}
}
