package com.kcl.project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;
import com.kcl.project.model.Course;;

@Entity
@Table(name = "student")
public class Student {

	
	private int id;
	
	
	private String firstName;
	private String SecondName;
	private String username;
	private String password;
	private Set<Course> Courses = new HashSet<Course>();
	
	public Student() {
		super();
	}
	
	@Id @GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Column(name = "first_name")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column(name = "second_name")
	public String getSecondName() {
		return SecondName;
	}
	public void setSecondName(String secondName) {
		SecondName = secondName;
	}
	@Column(name = "username")
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	@Column(name = "password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@ManyToMany(mappedBy="students")
	public Set<Course> getCourses() {
		return Courses;
	}
	public void setCourses(Set<Course> courses) {
		Courses = courses;
	}
	
	
}
