package com.simplilearn.Junit.JUnitDemo;

import java.util.Arrays;

import org.junit.jupiter.api.TestFactory;
import org.junit.jupiter.api.function.Executable;

public class Demo7 {
	
	@TestFactory
	public collection<DynamicTest> dynamicTests(){
		return Arrays.asList(
				dynamicTest("simple Test", () -> assertTrue(true)),
				dynamicTest("Executable Class", new MyExecutable()),
				dynamicTest("Exception Executable", () -> {throw new Exception("Exception Example");}),
				dynamicTest("Simple Test 2", () ->assertTrue(true)));
				
	}

}

class MyExecutable implements Executable {
	@Override
	public void execute() {
		System.out.println("Dynamic Test");
	}
}
