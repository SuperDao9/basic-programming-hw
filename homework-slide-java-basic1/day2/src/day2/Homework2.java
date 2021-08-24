package day2;

public class Homework2 {

		public static void main(String[] args) {

			String[][] table = { 
				     { "1", "2", "3" }, 
				     { "4", "5", "6" }, 
				     { "7", "8", "9" } 
				}; 
			
			multiplyTable(table);
		}
		
		 public static void multiplyTable(String[][] table) {

			 int myInt, myNewInt, rowCnt;
			 
			 
			  for (int row = 0; row < table.length; row++){
				   for (int element = 0; element < table[row].length; element++){
				       // System.out.println(table[row][element]);
				       myInt = Integer.parseInt(table[row][element]);
				       myNewInt = myInt * 2 ;
				       rowCnt = table[row].length - 1 ;
				       	if ( element == rowCnt) {
				       		System.out.println(myNewInt);
				       	} else {
				       		System.out.print(myNewInt + ", ");
				    	}
				       
				     }
			  }
			 
		 }
}
