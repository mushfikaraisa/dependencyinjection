package org.generation.dependencies_injection.service;

import java.util.ArrayList;
import java.util.List;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

//@Service
public class StudentServiceImpl implements StudentService {
	private List<Student> studentList = new ArrayList<>();
	
	
	public StudentServiceImpl() {
		super();
		generateTestStudents();
	}

	private void generateTestStudents() {
		Student student10 = new Student("10", 10, "John", "Doe", 1);
		studentList.add(student10);
	}

	@Override
	public void add(Student student) {
		studentList.add(student);

	}

	@Override
	public void delete(Student student) {
		studentList.remove(student);
	}

	@Override
	public List<Student> all() {
		return studentList;
	}

	@Override
	public Student findById(String id) {
		return studentList.stream().filter(current -> current.getIdStudent().equalsIgnoreCase(id)).findAny().orElse(null);
	}

}
