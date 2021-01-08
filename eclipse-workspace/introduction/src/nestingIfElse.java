
public class nestingIfElse {

	public static void main(String[] args) {
		
		int a = 12, b = 180, c = 50000;
		int result = 0;
		
		result = a > b ? a > c ? a : c : b > c ? b : c;
		
		
		System.out.println("largest of the 3 numbers is " + result);
	}

}
