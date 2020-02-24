package com.webwork.entity;


import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "classroom", schema = "curricula")
public class Classroom {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cla_id")
	private int claId;

	@Column(name = "cla_name", nullable = false)
	private String claName;

	@OneToMany(mappedBy = "classroom")
	@LazyCollection(LazyCollectionOption.EXTRA)
	private Set<Teach> teachs;

	public Classroom() {
		super();
	}

	public Classroom(int claId, String claName, Set<Teach> teachs) {
		super();
		this.claId = claId;
		this.claName = claName;
		this.teachs = teachs;
	}

	public int getClaId() {
		return claId;
	}

	public void setClaId(int claId) {
		this.claId = claId;
	}

	public String getClaName() {
		return claName;
	}

	public void setClaName(String claName) {
		this.claName = claName;
	}


	public Set<Teach> getTeachs() {
		return teachs;
	}

	public void setTeachs(Set<Teach> teachs) {
		this.teachs = teachs;
	}

	@Override
	public String toString() {
		return "Classroom [claId=" + claId + ", claName=" + claName + "]";
	}

}