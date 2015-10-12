package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StudentTestClass {
	

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
UUID UUID_Test = UUID.randomUUID();
Date currentDate = new Date();
ArrayList<Course> courseArray = new ArrayList<Course>();

courseArray.add(new Course(UUID_Test,"Cisc181",4,eMajor.COMPSI));
courseArray.add(new Course(UUID_Test,"Cisc182",4,eMajor.COMPSI));
courseArray.add(new Course(UUID_Test,"CISC183",4,eMajor.COMPSI));

ArrayList<Semester> semesterArray = new ArrayList<Semester>();
semesterArray.add(new Semester(UUID_Test,currentDate, currentDate));
semesterArray.add(new Semester(UUID_Test,currentDate, currentDate));

ArrayList<Section> sectionArray = new ArrayList<Section>();
sectionArray.add(new Section(UUID_Test,UUID_Test,UUID_Test,1));
sectionArray.add(new Section(UUID_Test,UUID_Test,UUID_Test,2));
sectionArray.add(new Section(UUID_Test,UUID_Test,UUID_Test,3));
sectionArray.add(new Section(UUID_Test,UUID_Test,UUID_Test,1));
sectionArray.add(new Section(UUID_Test,UUID_Test,UUID_Test,2));
sectionArray.add(new Section(UUID_Test,UUID_Test,UUID_Test,3));

ArrayList<Student> studentArray = new ArrayList<Student>();
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));
studentArray.add(new Student("trey","burns","brunson", currentDate, eMajor.BUSINESS,"23069 pecos lane","5719263381","trey3brunson@gmail.com"));

	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	//public void test() {
		//int sum = 0;
		//for(Student a : studentArray)
		{
		///	
	
		}
		

}
}