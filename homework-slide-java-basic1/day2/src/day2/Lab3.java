package day2;

public class Lab3 {

	public static void main(String[] args) {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i); // i = 25
		
		--i ;
		--i ;
		--i ;
		--i ;
		--i ;
		System.out.println(i);
		int numItemInCart = 0;
		numItemInCart++ ;
		System.out.println(numItemInCart);
		
		// 2  - And, Or can't be used with float, double , or any number, ONLY boolean
		// System.out.println(200.3f && 100.1f);  
		System.out.println(true && false);
		System.out.println(true || false);
		System.out.println("a" + "b"); // "ab"
	}
}
