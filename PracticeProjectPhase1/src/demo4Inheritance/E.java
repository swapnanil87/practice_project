package demo4Inheritance;

import demo1.calculator;

public class E extends calculator {
	public void nextyear() {
		System.out.println("It will be 2024 next year");
	}
	
	public static void main (String[] args) {
		E e = new E();
		e.add(4, 4);
	}

}