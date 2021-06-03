package org.generation.dependencies_injection.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplMap implements StudentService {
	private Map<String, Student> studentMap = new HashMap<String, Student>();
	
	
	public StudentServiceImplMap() {
		super();
		Student student10 = new Student("10", 10, "John", "Doe", 1);
		studentMap.put(student10.getIdStudent(), student10);
	}

	@Override
	public void add(Student student) {
		studentMap.put(student.getIdStudent(), student);

	}

	@Override
	public void delete(Student student) {
		studentMap.remove(student.getIdType());
	}

	@Override
	public List<Student> all() {
		return studentMap.entrySet().stream().map(current -> current.getValue()).collect(Collectors.toList());
	}

	@Override
	public Student findById(String id) {
		System.out.println("message THIS IS MAP_ >>>>>>>>>>>>>>>>>>>>>>");
		return studentMap.get(id);
	}

}
