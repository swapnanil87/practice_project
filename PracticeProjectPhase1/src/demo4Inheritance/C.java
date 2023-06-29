package demo4Inheritance;

public class C extends D{
	public void year() {
		System.out.println("It is 2023");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.year();
		c.date();
		c.nextyear();

	}

}