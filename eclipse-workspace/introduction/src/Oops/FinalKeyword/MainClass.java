package Oops.FinalKeyword;

public class MainClass {
	
final int  ROLL_NO = 4;


	public static void main(String[] args) {
		
Student obj = new Student();
 
 Student obj2 = new Student();
 
 obj.name = "Hadi";
  
		obj = obj2;
	}

}
