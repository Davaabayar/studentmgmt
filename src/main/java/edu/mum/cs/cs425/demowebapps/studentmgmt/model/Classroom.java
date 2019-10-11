package edu.mum.cs.cs425.demowebapps.studentmgmt.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Classroom {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long classroomId;
	private String buildingName;
	private String roomNumber;
	public Classroom(Long classroomId, String buildingName, String roomNumber) {
		super();
		this.classroomId = classroomId;
		this.buildingName = buildingName;
		this.roomNumber = roomNumber;
	}
	public Classroom() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getClassroomId() {
		return classroomId;
	}
	public void setClassroomId(Long classroomId) {
		this.classroomId = classroomId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
//Add a new entity named, Classroom (classroomId: primaryKey, buildingName, roomNumber)
	//to your solution above. Determine the relationship 
	//between Student entity and Classroom entity. And then implement JPA code for mapping and persisting//saving a student-and-classroom object data. Sample data: Classroom {1, "McLaughlin building", "M105"}
}
