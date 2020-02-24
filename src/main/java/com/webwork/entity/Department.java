package com.webwork.entity;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "department", schema = "curricula")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@OneToMany(mappedBy = "department")
	@LazyCollection(LazyCollectionOption.EXTRA)
	private Set<Clas> classes;
	
	@OneToMany(mappedBy = "department")
	@LazyCollection(LazyCollectionOption.TRUE)
	private Set<Teacher> teachers;

	public Department() {
		super();
	}

	public Department(int id, String departmentName) {
		super();
		this.id = id;
		this.departmentName = departmentName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}


	public Set<Clas> getClasses() {
		return classes;
	}

	public void setClasses(Set<Clas> classes) {
		this.classes = classes;
	}
	

	public Set<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(Set<Teacher> teachers) {
		this.teachers = teachers;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", departmentName=" + departmentName + "]";
	}
	
}
