package com.webwork.entity;

import javax.persistence.*;

@Entity
@Table(name = "elective", schema = "curricula")
public class Elective {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "student")
	private Student student;
	
	@ManyToOne
	@JoinColumn(name = "teach")
	private Teach teach;

	public Elective() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Teach getTeach() {
		return teach;
	}

	public void setTeach(Teach teach) {
		this.teach = teach;
	}

	@Override
	public String toString() {
		return "Elective [id=" + id + ", student=" + student + ", teach=" + teach + "]";
	}
	
	
}
