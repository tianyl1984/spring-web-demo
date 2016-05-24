package com.tianyl.mybatisDemo.mapper;

import java.util.List;

import com.tianyl.mybatisDemo.annotation.MybatisMapper;
import com.tianyl.mybatisDemo.model.Student;

@MybatisMapper
public interface StudentMapper {

	List<Student> findAll();

	void save(Student stu);
}
