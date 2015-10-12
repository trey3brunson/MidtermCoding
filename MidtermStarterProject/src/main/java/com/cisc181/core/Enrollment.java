package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
	}
	
	private Enrollment(UUID StudentID, UUID SectionID){
		this.EnrollmentID=EnrollmentID;
	}

	public void setGrade() {
		this.Grade = Grade;
	}
	
}

