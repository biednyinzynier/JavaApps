package com.burak.association;

import java.util.List;

public class Faculty {
	private String facultyName;
	private List<Department> departments;
	
	public Faculty(String facultyName, List<Department> departments) {
		this.facultyName = facultyName;
		this.departments = departments;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public String getName() {
		return facultyName;
	}
	
	public int getTotalStudentsInFaculty() 
    { 
        int noOfStudents = 0; 
        List<Student> students;  
        for(Department dept : departments) 
        { 
            students = dept.getStudents(); 
            for(Student s : students) 
            { 
                noOfStudents++; 
            } 
        } 
        return noOfStudents; 
    } 
	
}
