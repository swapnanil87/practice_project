package com.simplilearn.Junit.JUnitDemo;

public interface Demo5 {
	
	public void day();
	
	public default void month() {
		System.out.println("It is july");
	}

}
