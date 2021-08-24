package day2;

import java.util.Scanner;

public class Homework8 {

	public static void main(String[] args) {
		
		/* int firstArg;
		if (args.length > 0) {
		    try {
		        firstArg = Integer.parseInt(args[0]);
		        draw1(firstArg);
		        draw2(firstArg);
		    } catch (NumberFormatException e) {
		        System.err.println("Argument" + args[0] + " must be an integer.");
		        System.exit(1);
		    }
		}
		*/
		 int myMax = 6;
		 
		 Scanner scan = new Scanner(System.in);
		 
	   	 System.out.println("Draw value allow between 1 - " + myMax + " (Max)");
		 System.out.print("Enter Draw number: ");
	     // This method reads the number provided using keyboard
	     int myNum = scan.nextInt();
	     
		 int n;

		 if (myNum > myMax) {
		   	 System.out.println("Change value " + myNum + " to " + myMax + " (Max) ");
			 n = myMax ;
		 } else {
			 n = myNum ;
		 };
		 
	     draw(n);
	     	
	     scan.close();
		

	 }
	
	 public static void draw(int n) {
		 
		 // Limit max Draw = 5
	     	draw1(n);
	     	draw2(n);
	     	draw3(n);
	     	draw4(n);
	     	draw5(n);
	     	draw6(n);
	     	draw7(n);
	     	draw8(n);
	     

		 System.out.println("");
		//  System.out.println("n = " + n);
	 }

	// Return value method
	 public static void draw1(int n) {
		 
		 System.out.println("");
		 System.out.println("Draw1(" + n + ")");
		 
		 for (int cnt=1; cnt<=n; cnt++) {
			 System.out.print("*");
		 }
		 System.out.println("");
		//  System.out.println("n = " + n);
	 }

	// Void method
	 public static void draw2(int n) {

		 System.out.println("");
		 System.out.println("Draw2(" + n + ")");
		 
		 for (int myLine=1; myLine<= n; myLine++) {
			 for (int cnt=1; cnt<=n; cnt++) {
				 System.out.print("*");
			 }
			 System.out.println("");
		 }

		// System.out.println("n = " + n);
	 }
	 
	 public static void draw3(int n) {

		 System.out.println("");
		 System.out.println("Draw3(" + n + ")");
		 
		 for (int myLine=1; myLine<= n; myLine++) {
			 for (int cnt=1; cnt<=n; cnt++) {
				 System.out.print(cnt);
			 }
			 System.out.println("");
		 }

		//  System.out.println("n = " + n);
	 }
	 
	 public static void draw4(int n) {

		 System.out.println("");
		 System.out.println("Draw4(" + n + ")");
		 
		 for (int myLine=1; myLine<= n; myLine++) {
			 for (int cnt=n; cnt>0; cnt--) {
				 System.out.print(cnt);
			 }
			 System.out.println("");
		 }

		//  System.out.println("n = " + n);
	 }
	 
	 public static void draw5(int n) {

		 System.out.println("");
		 System.out.println("Draw5(" + n + ")");
		 
		 for (int myLine=1; myLine<= n; myLine++) {
			 for (int cnt=1; cnt<=n; cnt++) {
				 System.out.print(myLine);
			 }
			 System.out.println("");
		 }

		// System.out.println("n = " + n);
	 }
	 
	 public static void draw6(int n) {

		 System.out.println("");
		 System.out.println("Draw6(" + n + ")");
		 
		 for (int myLine=n; myLine>0; myLine--) {
			 for (int cnt=n; cnt>0; cnt--) {
				 System.out.print(myLine);
			 }
			 System.out.println("");
		 }

		//  System.out.println("n = " + n);
	 }
	 
	 public static void draw7(int n) {

		 System.out.println("");
		 System.out.println("Draw7(" + n + ")");
		 int mySum = 1;
		 
		 for (int myLine=1; myLine<= n; myLine++) {
			 for (int cnt=1; cnt<=n; cnt++) {
				 System.out.print(mySum);
				 mySum++ ;
			 }
			 System.out.println("");
		 }

		//  System.out.println("n = " + n);
	 }
	 
	 public static void draw8(int n) {

		 System.out.println("");
		 System.out.println("Draw8(" + n + ")");
		 int mySum = n*n;
		 
		 for (int myLine=1; myLine<= n; myLine++) {
			 for (int cnt=1; cnt<=n; cnt++) {
				 System.out.print(mySum);
				 mySum-- ;
			 }
			 System.out.println("");
		 }

		// System.out.println("n = " + n);
	 }
}
