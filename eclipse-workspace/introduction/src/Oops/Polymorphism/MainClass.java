package Oops.Polymorphism;

public class MainClass {

	public static void main(String[] args) {
		
		Dog d = new Dog();
		Pet p = d;

		System.out.println(d.name);
		System.out.println(p.name);
		
		
//		greetings("Elon musk" , 1);		
	}

	public static void greetings() {
		System.out.println("Hi, there");
	}
	
	public static void greetings(String s) {
		System.out.println(s);
		
	}
	
	public static void greetings(String s, int count) {
		for(int i = 0; i<count; i++) {
			System.out.println(s);
		}
	}
}
