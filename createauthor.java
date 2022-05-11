package com.sdnext.hibernate.tutorial;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.sdnext.hibernate.tutorial.dto.Student;
import com.sdnext.hibernate.tutorial.utility.HibernateUtil;

public class CreateAuthor {

 /**
  * @param args
  */
 public static void main(String[] args) 
 {
  //Create Author entity object
  Author Author = new Author();
  Author.setAuthorName("name1");
  Author.setRollNumber(01);
  Author.setCourse("MCA");
  
  //Create session factory object
  SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
  //getting session object from session factory
  Session session = sessionFactory.openSession();
  //getting transaction object from session object
  session.beginTransaction();
  
  session.save(Author);
  System.out.println("Inserted Successfully");
  session.getTransaction().commit();
  session.close();
  sessionFactory.close();
 }
}