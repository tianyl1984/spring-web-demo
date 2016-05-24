package com.tianyl.mybatisDemo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tianyl.mybatisDemo.mapper.StudentMapper;
import com.tianyl.mybatisDemo.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentMapper studentMapper;

	@Transactional
	public void save() {
		Student student = new Student();
		student.setAge(13);
		student.setName("王五");
		studentMapper.save(student);
		new ArrayList<>().get(10);
		student.setName("aaaa");
		studentMapper.save(student);
		// System.out.println(SpringContextHolder.getBeanOneOfType(AspectDemo.class));
	}

	public List<Student> list() {
		return studentMapper.findAll();
	}

}
