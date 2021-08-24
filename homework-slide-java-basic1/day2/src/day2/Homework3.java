package day2;
import java.util.Scanner;

public class Homework3 {

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
		     	draw9(n);
		     	draw10(n);
		     	draw11(n);
		     	draw12(n);
		     	draw13(n);
		     	draw14(n);
		     	draw15(n);
		     	draw16(n);
		     	draw17(n);

			 System.out.println("");
			//  System.out.println("n = " + n);
		 }

		// Return value method
		 public static void draw9(int n) {
			 
			 int cnt = 1;
			 int myValue=0;
			 
			 System.out.println("");
			 System.out.println("Draw9(" + n + ")");
			 
			 while ( cnt <= n) {
				 if ( myValue % 2 == 0) {
					 System.out.println(myValue);
					 cnt++ ;
				 } ;
				 myValue++;
			 }

		 }

		// Void method
		 public static void draw10(int n) {

			 int cnt = 1;
			 int myValue=2;
			 
			 System.out.println("");
			 System.out.println("Draw10(" + n + ")");
			 
			 while ( cnt <= n) {
				 if ( myValue % 2 == 0) {
					 System.out.println(myValue);
					 cnt++ ;
				 } ;
				 myValue++;
			 }
			 
		 }
		 
		 public static void draw11(int n) {

			 int line = 1;
			 int row = 1;
			 int myValue=1;
			 
			 System.out.println("");
			 System.out.println("Draw11(" + n + ")");
			 
			 while ( line <= n) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( myValue % line == 0) {
						 System.out.print(myValue + " ");
						 row++ ;
					 } ;
					 myValue++;
				 }
				 System.out.println("");
				 line++;
			 }
			 
		 }

		 public static void draw12(int n) {

			 int line = 1;
			 int row = 1;
			 int myValue=1;
			 
			 System.out.println("");
			 System.out.println("Draw12(" + n + ")");
			 
			 while ( line <= n) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row == line ) {
						 System.out.print("_");
					 } else {
						 System.out.print("*");
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line++;
			 }
			 
		 }
		 
		 public static void draw13(int n) {

			 int line = n;
			 int row = 1;
			 int myValue=1;
			 
			 System.out.println("");
			 System.out.println("Draw13(" + n + ")");
			 
			 while ( line > 0) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row == line ) {
						 System.out.print("_");
					 } else {
						 System.out.print("*");
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line--;
			 }
			 
		 }
		 
		 public static void draw14(int n) {

			 int line = 1;
			 int row = 1;
			 int myValue=1;
			 
			 System.out.println("");
			 System.out.println("Draw14(" + n + ")");
			 
			 while ( line <= n ) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row > line ) {
						 System.out.print("_");
					 } else {
						 System.out.print("*");
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line++;
			 }
			 
		 }

		 public static void draw15(int n) {

			 int line = n;
			 int row = 1;
			 int myValue ;
			 
			 System.out.println("");
			 System.out.println("Draw15(" + n + ")");
			 
			 while ( line > 0 ) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row > line ) {
						 System.out.print("_");
					 } else {
						 System.out.print("*");
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line--;
			 }
			 
		 }
		 
		 public static void draw16(int n) {

			 int line = 1;
			 int row = 1;
			 int myValue = 1;
			 
			 System.out.println("");
			 System.out.println("Draw16(" + n + ")");
			 
			 while ( line <= n ) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row > line ) {
						 System.out.print("_");
					 } else {
						 System.out.print("*");
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line++;
			 }
			 
			 line = n - 1 ;
			 row = 1;
			 
			 while ( line > 0 ) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row > line ) {
						 System.out.print("_");
					 } else {
						 System.out.print("*");
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line--;
			 }
			 
		 }

		 public static void draw17(int n) {

			 int line = 1;
			 int row = 1;
			 int myValue = 1;
			 
			 System.out.println("");
			 System.out.println("Draw17(" + n + ")");
			 
			 while ( line <= n ) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row > line ) {
						 System.out.print("_");
					 } else {
						 System.out.print(line);
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line++;
			 }
			 
			 line = n - 1 ;
			 row = 1;
			 
			 while ( line > 0 ) {
				 myValue = line;
				 row = 1;
				 while ( row <= n) {
					 if ( row > line ) {
						 System.out.print("_");
					 } else {
						 System.out.print(line);
					 }
					 myValue++;
					 row++ ;
				 }
				 System.out.println("");
				 line--;
			 }
			 
		 }
		 
}
