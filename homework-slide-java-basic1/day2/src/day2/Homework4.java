package day2;
import java.util.Scanner;

public class Homework4 {

	public static void main(String[] args) {
		 
		 Scanner scan = new Scanner(System.in);
		 System.out.print("Enter number: ");
	    // This method reads the number provided using keyboard
	    int myNum = scan.nextInt();
	    
		multiplyForm(myNum);
	    	
	    scan.close();
	}

	public static void multiplyForm(int n) {
		System.out.println("");
		System.out.println("Multiply formula of " + n);
		
		for(int i=1; i<=12; i++) {
			System.out.println(n + " x " + i + " = " + n*i );
		}
		
	}
	
}
