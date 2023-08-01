package com.simplilearn.Junit.JUnitDemo;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Demo1 {
	
	@BeforeAll
	public static void setup() {
		System.out.println("hello");
	}
	
	@Test
	public void test1() {
		System.out.println("Test 1");
	}
	
	@AfterAll
	public static void tearDown() {
		System.out.println("Bye Bye");
	}

}