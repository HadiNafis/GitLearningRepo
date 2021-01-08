package Oops;


	
	class Vehicle {
		int wheels;
		int headLights;
		
	 Vehicle(int noOfWheels) {
		 wheels = noOfWheels;
		 headLights = 2;
		 
		 
			
			
		}
	}
	public class MyConstructor {
	
	MyConstructor() {
	
			
		
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
		
	
		Vehicle car = new Vehicle(4);
		Vehicle bike = new Vehicle(2);
	System.out.println(car.wheels +" wheels");
	System.out.println(bike.wheels +" wheels");
	
		
		

	}

}
