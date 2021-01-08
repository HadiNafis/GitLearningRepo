package Oops;

//class Cat {
//	boolean hasFur;
//	String colour,breed ;
//	int legs, eyes;
//	public void walk() {
//		System.out.println("Cat is walking");
//	}
//	
//	public void eat() {
//		System.out.println("cat is eating");
//	}
//	
//	public void description() {
//		System.out.println("my cat has " + legs +" legs and "+ eyes +" eyes");
//	}
//}
class Dog {
	
	String breed, name;
	
	public void jump() {
		System.out.println("my dog "+ name +" jumped");
	}
	
	public void description() {
System.out.println("my dog's name is "+ name +" and it's breed is "+ breed);

	

	
}


public static class MainClass {

	public static void main(String[] args) {
		
	
	Dog husky = new Dog();
	Dog poodle = new Dog();
	
	husky.breed = "husky";
	husky.name = "browny";
	
	poodle.breed = "poodle";
	poodle.name = "sexy boii";
	
	husky.jump();
	husky.description();
	
	poodle.jump();
	poodle.description();
	
	
	
		
		

	}

}
}
