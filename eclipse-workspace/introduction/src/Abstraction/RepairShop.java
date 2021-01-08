package Abstraction;

public class RepairShop {
	public static void repairCar(car car) {
		System.out.println("Car is repaired");
		

	}
	public static void main(String[] args) {
		
		Tesla Tesla = new Tesla();
		Audi audi = new Audi();
		
		repairCar(Tesla);
		repairCar(audi);
		
		
	}

}
