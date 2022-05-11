package com.sdnext.hibernate.tutorial.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name="AUTHOR")
public class Author implements Serializable 
{

 /**
  * serialVersionUID
  */
 private static final long serialVersionUID = 8633415090390966715L;
 @Id
 @Column(name="ID")
 @GeneratedValue(strategy=GenerationType.AUTO)
 private int author_id;
 @Column(name="Author_NAME")
 private String firstName;
 @Column(name="Author_NAME")
 private String middleName;
 @Column(name="Author_NAME")
 private String lastName;
 @Column(name="ROLL_NUMBER")
 private int phoneno;
 
 public int getId() {
  return id;
 }
 public void setId(int id) {
  this.id = id;
 }
 public String getAuthorName() {
  return AuthorName;
 }
 public void setAuthorName(String AuthorName) {
  this.AuthorName = AuthorName;
 }
 public int getRollNumber() {
  return rollNumber;
 }
 public void setRollNumber(int rollNumber) {
  this.rollNumber = rollNumber;
 }
 public String getCourse() {
  return course;
 }
 public void setCourse(String course) {
  this.course = course;
 }
}