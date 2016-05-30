package com.tianyl.mybatisDemo;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.tianyl.mybatisDemo.mapper.StudentMapper;
import com.tianyl.mybatisDemo.model.Student;

public class SingleMybatisDemo {

	private final static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "mybatis-config-single.xml";
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		SqlSession sqlSession = sqlSessionFactory.openSession();
		StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
		List<Student> students = studentMapper.findAll();
		for (Student stu : students) {
			System.out.println(stu.getName());
		}
		sqlSession.commit();
		sqlSession.close();
	}
}
