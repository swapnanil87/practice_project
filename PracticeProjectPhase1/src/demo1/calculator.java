package demo1;

public class calculator{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	public void substract(int a, int b) {
		System.out.println(a-b);
	}
	public void multiply(int a, int b) {
		System.out.println(a*b);
	}
	public void  divide(double a, double b) {
		System.out.println(a/b);
	}
	
	public static void main(String[]args) {
		
		calculator calculator = new calculator();
		calculator.add(10, 20);
		calculator.substract(30, 20);
		calculator.multiply(20, 20);
		calculator.divide(240, 12);
	}
}