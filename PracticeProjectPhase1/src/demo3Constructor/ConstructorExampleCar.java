package demo3Constructor;

public class ConstructorExampleCar {
	
	private String color;
	private String engineType;
	
	// constructor
	public ConstructorExampleCar(String colorOfCar, String typeOfEngine) {
		color = colorOfCar;
		engineType = typeOfEngine;
	}
	
	public void printCarProperties() {
		System.out.println("color of car = " + color);
		System.out.println("Type of engine = " + engineType);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExampleCar mercedes = new ConstructorExampleCar("silver", "petrol");
		ConstructorExampleCar audi = new ConstructorExampleCar("black", "diesel");
		
		audi.printCarProperties();
		mercedes.printCarProperties();
		

	}

}