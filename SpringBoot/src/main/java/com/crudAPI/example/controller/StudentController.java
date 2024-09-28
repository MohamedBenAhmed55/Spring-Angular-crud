package com.crudAPI.example.controller;

import org.springframework.web.bind.annotation.*;

import com.crudAPI.example.entity.Students;
import com.crudAPI.example.service.StudentService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


@RestController
@CrossOrigin("*")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping("/addStudent")
	@CrossOrigin(origins = "*")
	public Students addStudent(@RequestBody Students students) {
		return studentService.addStudent(students);
	}
	
	@GetMapping("/getStudents")
	@CrossOrigin(origins = "*")
	public List<Students> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@PostMapping("/updateStudent")
	@CrossOrigin(origins = "*")
	public Students updateStudent(@RequestBody Students students) {
		return studentService.udpateStudent(students);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	@CrossOrigin(origins = "*")
	public Boolean deleteStudent(@PathVariable int id) {
		return studentService.deleteStudent(id);
	}
	
	

}
