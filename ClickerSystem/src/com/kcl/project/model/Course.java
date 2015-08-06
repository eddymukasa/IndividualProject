package com.kcl.project.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "course")
public class Course {

	
	private int id;
	private String name;
	private Set<Student> students = new HashSet<Student>();
	private Set<Lecturer> lecturers = new HashSet<Lecturer>();
	public Course(){
		
	}

	@Id @GeneratedValue
	@Column(name = "id")
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@ManyToMany
    @JoinTable(name="Course_Student", 
                joinColumns={@JoinColumn(name="Course_ID")}, 
                inverseJoinColumns={@JoinColumn(name="Student_ID")})
	public Set<Student> getStudents() {
		return students;
	}

	
	public void setStudents(Set<Student> students) {
		this.students = students;
	}

	@ManyToMany
    @JoinTable(name="Course_Lecturer", 
                joinColumns={@JoinColumn(name="Course_ID")}, 
                inverseJoinColumns={@JoinColumn(name="Lecturer_ID")})
	public Set<Lecturer> getLecturers() {
		return lecturers;
	}

	public void setLecturers(Set<Lecturer> lecturers) {
		this.lecturers = lecturers;
	}
	
	
}
