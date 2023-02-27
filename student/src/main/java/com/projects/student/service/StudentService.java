package com.projects.student.service;

import java.util.List;

import com.projects.student.model.Student;

public interface StudentService {

	public Student saveStudent (Student student);
	public List<Student> getAllStudents();
}
