package com.test.JDBC;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;

public class TestNg {
	@Test
	public void Test() {
		Validate validate = new Validate();
		int expected_Value = validate.Validate_DB();
		int actual_Value = 1;
		System.out.println("\n\n" + "expected_value = " + expected_Value + "\n" + "actual_Value = " + actual_Value);
		assertEquals(actual_Value, expected_Value);

	}

	@Test
	public void Test1() {
		Validate validate = new Validate();
		int exp = validate.Validating_Table();
		int act = 2;
		System.out.println("\n\n" + "expected_value = " + exp + "\n" + "actual_Value = " + act);
		assertEquals(act, exp);

	}

	@Test
	public void Test2() {
		Validate validate = new Validate();
		int exp = validate.BookShowValidate();
		int act = 2;
		System.out.println("\n\n" + "expected_value = " + exp + "\n" + "actual_Value = " + act);
		assertEquals(act, exp);

	}

	@BeforeClass
	public void beforeClass() {
	}

	@AfterClass
	public void afterClass() {
	}

}
