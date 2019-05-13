package com.burak.association;

import java.util.List;

public class Department {
	private String deptName;
	private List<Student> students;
	
	public Department(String deptName, List<Student> students) {
		this.deptName = deptName;
		this.students = students;
	}
	
	public String getName() {
		return deptName;
	}

	public List<Student> getStudents() {
		return students;
	}
}
