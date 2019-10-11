package edu.mum.cs.cs425.demowebapps.studentmgmt;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import edu.mum.cs.cs425.demowebapps.studentmgmt.model.Classroom;
import edu.mum.cs.cs425.demowebapps.studentmgmt.model.Student;
import edu.mum.cs.cs425.demowebapps.studentmgmt.model.Transcript;
import edu.mum.cs.cs425.demowebapps.studentmgmt.repository.ClassroomRepository;
import edu.mum.cs.cs425.demowebapps.studentmgmt.repository.StudentRepository;
import edu.mum.cs.cs425.demowebapps.studentmgmt.repository.TranscriptRepository;

@SpringBootApplication
public class StudentMgmtApp implements CommandLineRunner{

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private TranscriptRepository transcriptRepository;
	
	@Autowired
	private ClassroomRepository classroomRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(StudentMgmtApp.class, args);
	}
	void saveStudent() {
		Student s1 = new Student();
		s1.setStudentNumber("000-61-001");
		s1.setFirstName("Anna");
		s1.setLastName("Lynn");
		s1.setMiddleName("Smith");
		s1.setDateOfEnrollment(LocalDate.of(2019, 5, 24));		
		
		Transcript t1 = new Transcript(1L, "BS Computer Science");		
	
		transcriptRepository.save(t1);
		studentRepository.save(s1);
		
		Classroom c1 = new Classroom(1L, "McLaughlin building", "M105");
		classroomRepository.save(c1);
	}
	@Override
	public void run(String... args) throws Exception {
		saveStudent();
	}

}