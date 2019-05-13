package com.burak.association;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Burak", "E-Electronics Engineering");
		Student student2 = new Student(2, "Ömer", "E-Electronics Engineering");
		Student student3 = new Student(3, "Caner", "Computer Engineering");
		Student student4 = new Student(4, "Zafer", "Computer Engineering");
		
		List<Student> eeStudents = new ArrayList<Student>();
		eeStudents.add(student1);
		eeStudents.add(student2);
		
		List<Student> ceStudents = new ArrayList<Student>();
		ceStudents.add(student3);
		ceStudents.add(student4);
		
		Department eeDepartment = new Department("E-Electronics Engineering", eeStudents);
		Department ceDepartment = new Department("Computer Engineering", ceStudents);
		
		List<Department> departments = new ArrayList<Department>();
		departments.add(eeDepartment);
		departments.add(ceDepartment);
		
		Faculty faculty = new Faculty("Engineering Faculty", departments);
		
		System.out.println("Total students in the faculty: " + faculty.getTotalStudentsInFaculty());
	}
}
