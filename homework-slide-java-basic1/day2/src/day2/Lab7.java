package day2;
import java.util.Scanner;

public class Lab7 {
	public static void main(String[] args) {
		
		// 1 - print ค่าตัวเลข 20 โดยเริ่มจากมากไปน้อย
		int i = 20;
		while (i > 0) {
			System.out.println("Counter " + i);
			i-- ;
		}
		
		// 2 - เขียนโปรแกรมตรวจสอบตัวเลข ว่าเป็นจำนวนคู่ หรือจำนวนคี่ โดยโปรแกรมจะทำงานในลูปเรื่อยๆ ถ้าหากเขายังคงกรอกเลขคู่ 
		//     แต่ถ้ากรอกเลขคี่จะเป็นการออกจากลูป
		 Scanner scan = new Scanner(System.in);
			
		 	System.out.print("Enter any number: ");
	        // This method reads the number provided using keyboard
	        int myNum = scan.nextInt();
	        
	        while (myNum % 2 == 0) {
	        	
	        	System.out.println("Even number : " + myNum);
				System.out.print("\nEnter any number: ");
		        // This method reads the number provided using keyboard
		        myNum = scan.nextInt();
		        
		        // System.out.println("Your number is " + myNum);
				// System.out.println("Even Number -> " + myNum);
					
			} 
	        
	        System.out.println("Odd Number : " + myNum + " EXIT ");
		    
	        // Closing Scanner after the use
			scan.close();
	}
}
