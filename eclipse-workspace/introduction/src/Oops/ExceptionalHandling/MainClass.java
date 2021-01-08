package Oops.ExceptionalHandling;

public class MainClass {

	public static void main(String[] args) {
		
		try {
		int a[] = new int[5];
		
		System.out.println(a[6]);
	} catch(ArithmeticException e) {
		System.out.println(e.getMessage() +" occured, please check your code");
		
	} catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("index should be in the range of 0 to size of array");
		
	}  catch(IllegalArgumentException e) {
		System.out.println("Check your casting carefully");
	}  finally {
		System.out.println("Sorry for the inconvenience nigga6");
	} 
		System.out.println("very importamt code");
		System.out.println("need to run");
	}
	
	static void fun() {
		int a = 5;
		int b = 6;
		
	}

}
