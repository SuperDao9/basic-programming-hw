package day2;

public class Lab2 {
	public static void main(String[] args) {
		bark();
		int layPrice = 10;
		int pepsiPrice = 20;
		String layPrice2 = "10";
		String pepsiPrice2 = "20";
		sumAndPrint(layPrice, pepsiPrice);
		sumAndPrintString(layPrice2, pepsiPrice2);
		
		// float to int
		float numA = 100.2f;
		System.out.println(numA);
		int change = (int)numA;  // float to integer
		System.out.println(change);
		
		// 2 integer to float
		float numB = 100;  // integer to float
		System.out.println(numB);

		
		// 3
		final String hello = "hello";
		
		// Error
		// hello = "World" ; 
		
		
		
	}
	
	public static void bark() {
		String dogName = "Coffee";
		System.out.println("The Dog name = " + dogName + " bark");
	}
	
	public static void sumAndPrint(int priceA, int priceB) {
		System.out.println("Sum price = " + (priceA + priceB));
	}
	
	public static void sumAndPrintString(String priceA, String priceB) {
		System.out.println("Sum price String = " + (priceA + priceB));
	}
}

