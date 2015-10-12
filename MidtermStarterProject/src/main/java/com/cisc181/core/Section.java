package com.cisc181.core;
import java.util.UUID;
import java.util.Date;

public class Section {
	public Section(UUID courseID, UUID semesterID, UUID sectioID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectioID = sectioID;
		RoomID = roomID;
	}
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectioID;
	private int RoomID;

}
