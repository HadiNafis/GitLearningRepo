package Oops.ExceptionalHandling;

public class ThrowsandThrows {

	public static void main(String[] args) {
		
		fun1();
		
	}
	static void fun1() {
		int a = 5;
		int b = 3;
		int c = a/b;
		
		System.out.println(c);
		
		try {
		Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			
			System.out.println("after delay");
		}
	}
	
	static void fun2()
 throws ArrayIndexOutOfBoundsException {
		boolean isDanger = true;
		if(isDanger) {
			
			throw new ArrayIndexOutOfBoundsException("danger was coming");	
	}

}
}