package com.SpringORM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringORM.dao.StudentDao;
import com.SpringORM.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext con=new ClassPathXmlApplicationContext("config.xml");
       StudentDao studentDao = con.getBean("studentDao",StudentDao.class);
       Student stu=new Student(101,"Indal Rai","Nagpur");
       studentDao.insert(stu);
       
    }
}
