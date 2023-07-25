package com.simplilearn.Junit.JUnitDemo;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Demo2 {
	
	@Test
	public void testAssertions() {
		String str1 = new String("abc");
		String str2 = new String("abc");
		String str3 = null;
		String str4 = "abc";
		String str5 = "abc";
		
		int val1 = 5;
		int val2 = 6;
		
		String[] expectedArray = {"one", "two", "three"};
		String[] resultArray = {"one", "two", "three"};;
		
		//Check that two objects are equal
		assertEquals(str1, str2);
		
		//Check that a condition is true
		assertTrue(val1 < val2);
		
		//check condition false
		assertFalse(val1 > val2);
		
		//check that an object is not Null
		assertNotNull(str1);
		
		//check of tw
		assertSame(str1, str3);
		
		//Check if 2 arrays are equal
		assertArrayEquals(expectedArray, resultArray);
	}


}
