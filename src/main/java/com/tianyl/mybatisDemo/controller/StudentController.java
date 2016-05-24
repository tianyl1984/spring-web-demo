package com.tianyl.mybatisDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tianyl.mybatisDemo.model.Student;
import com.tianyl.mybatisDemo.service.StudentService;

@Controller
@RequestMapping("student")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@RequestMapping("save")
	public Object save() {
		studentService.save();
		return "vm/ok";
	}

	@RequestMapping("list")
	public Object list(Model model) {
		List<Student> students = studentService.list();
		model.addAttribute("students", students);
		return "vm/student-list";
	}
}
