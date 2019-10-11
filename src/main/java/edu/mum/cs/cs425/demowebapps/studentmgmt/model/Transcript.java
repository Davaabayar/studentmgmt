package edu.mum.cs.cs425.demowebapps.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="transcripts")
public class Transcript {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long transcriptId;
	String degreeTitle;
	
//	@OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "Student_Id", nullable = false)
//    private Student student;
	
	public Transcript() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Transcript(Long transcriptId, String degreeTitle) {
		super();
		this.transcriptId = transcriptId;
		this.degreeTitle = degreeTitle;
	}
	public Long getTranscriptId() {
		return transcriptId;
	}
	public void setTranscriptId(Long transcriptId) {
		this.transcriptId = transcriptId;
	}
	public String getDegreeTitle() {
		return degreeTitle;
	}
	public void setDegreeTitle(String degreeTitle) {
		this.degreeTitle = degreeTitle;
	}
	
	
}
