package edu.mum.cs.cs425.demowebapps.studentmgmt.model;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="students")
public class Student {
	 @OneToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	 @JoinColumn(name="Transcript_Id")
	private Transcript transcript;

	public Transcript getTranscript() {
		return transcript;
	}
	public void setTranscript(Transcript transcript) {
		this.transcript = transcript;
	}
	public Long getStudentId() {
		return studentId;
	}
	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Float getCgpa() {
		return cgpa;
	}
	public void setCgpa(Float cgpa) {
		this.cgpa = cgpa;
	}
	public LocalDate getDateOfEnrollment() {
		return dateOfEnrollment;
	}
	public void setDateOfEnrollment(LocalDate dateOfEnrollment) {
		this.dateOfEnrollment = dateOfEnrollment;
	}
	public Student(Long studentId, @NotEmpty String studentNumber, @NotEmpty String firstName, String middleName,
			@NotEmpty String lastName, Float cgpa, LocalDate dateOfEnrollment) {
		super();
		this.studentId = studentId;
		this.studentNumber = studentNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.cgpa = cgpa;
		this.dateOfEnrollment = dateOfEnrollment;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long studentId;
	@NotEmpty
	String studentNumber;
	@NotEmpty
	String firstName;
	String middleName;
	@NotEmpty
	String lastName;
	Float cgpa;
	LocalDate dateOfEnrollment;
}
