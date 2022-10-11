package com.SpringORM.dao;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.SpringORM.entity.Student;

public class StudentDao {

	private  HibernateTemplate hibernatetemplate;

	@Transactional
	public HibernateTemplate getHibernatetemplate() {
		return hibernatetemplate;
	}

	public void setHibernatetemplate(HibernateTemplate hibernatetemplate) {
		this.hibernatetemplate = hibernatetemplate;
	}
	
	public void insert (Student student) {
		hibernatetemplate.save(student);
	}
	
	public void update(Student student) {
		hibernatetemplate.update(student);
	}
	
	public Student getStudent(int roll) {
		return hibernatetemplate.get(Student.class,roll);
	}
	
	public void delete(int roll) {
		hibernatetemplate.delete(getStudent(roll));
	}
	
	public List<Student> getAllStudent(){
		return (List<Student>) hibernatetemplate.find("from Student");
	}
	
	
}
