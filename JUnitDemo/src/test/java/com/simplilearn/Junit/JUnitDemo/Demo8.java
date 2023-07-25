package com.simplilearn.Junit.JUnitDemo;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Demo8 {
	
	@parameterizedTest
	@ValueSource(ints = {1,2,3})
	public void test1(int i) {
		System.out.println(i);
	}
	
	@parameterizedTest
	@ValueSource(string = {"4", "5", "6"})
	public void test2(String s) {
		assertTrue(Integer.parseInt(s)<6);
	}

}
