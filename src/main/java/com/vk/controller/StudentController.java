package com.vk.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vk.beans.Student;

@RestController
@RequestMapping("/students")
public class StudentController {

	@GetMapping("student/{id}")
	public Student getStudent(@PathVariable int id) {
		return new Student(id, "Vishal", "Khandelwal");
	}
	
	@GetMapping
	public List<Student> getAll() {
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student(1, "Vishal", "Khandelwal"));
		list.add(new Student(2, "Nisha", "Khandelwal"));
		list.add(new Student(3, "Alka", "Khandelwal"));
		list.add(new Student(4, "Shiv Shankar", "Khandelwal"));
		
		return list; 
	}
}
