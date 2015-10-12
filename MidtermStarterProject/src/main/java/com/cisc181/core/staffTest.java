package com.cisc181.core;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class staffTest {
	Date currentDate = new Date();
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}
	
	    

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}
	public static ArrayList<Staff> array1 = new ArrayList<Staff>();
	@Before
	public void setUp() throws Exception {
		array1.add(new Staff("Trey", "Burns", "Brunson", currentDate, "23069 pecos lane", "5719263381", "Trey3brunson@gmail.com", "Tuesday 2-4pm", 10, 100000, currentDate, eTitle.Teacher));
		array1.add(new Staff("Trey", "Burns", "Brunson", currentDate, "23069 pecos lane", "5719263381", "Trey3brunson@gmail.com", "Tuesday 2-4pm", 10, 200000, currentDate, eTitle.Teacher));
		array1.add(new Staff("Trey", "Burns", "Brunson", currentDate, "23069 pecos lane", "5719263381", "Trey3brunson@gmail.com", "Tuesday 2-4pm", 10, 300000, currentDate, eTitle.Teacher));
		array1.add(new Staff("Trey", "Burns", "Brunson", currentDate, "23069 pecos lane", "5719263381", "Trey3brunson@gmail.com", "Tuesday 2-4pm", 10, 400000, currentDate, eTitle.Teacher));
		array1.add(new Staff("Trey", "Burns", "Brunson", currentDate, "23069 pecos lane", "5719263381", "Trey3brunson@gmail.com", "Tuesday 2-4pm", 10, 500000, currentDate, eTitle.Teacher));
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int sum = 0;
		for(Staff a : array1)
		{
			
		    sum +=a.getSalary();
		}
		sum = sum / array1.size();
		System.out.println(sum);
		assertEquals("The test found the average of salaries",sum,300000);
		
	}

}
