package com.cisc181.core;
import java.util.UUID;
import java.util.Date;
public class Semester {
	public Semester(UUID semesterID, Date startDate, Date endDate) {
		super();
		SemesterID = semesterID;
		StartDate = startDate;
		EndDate = endDate;
	}
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
}
