package day2;

public class Lab13 {
	
	public static void main(String[] args) {
		 int[][] twoD_Array = {
			     {10, 20, 30, 40}, {50, 60, 70, 80, 90}, {10, 11}
			   };
		// ทดลองสร้างอาเรย์ 2 มิติ และวนลูปแล้ว print ให้ครบทุกจำนวน
		 for (int[] row : twoD_Array) {
			 System.out.println("New Row ");
			 for (int element: row) {
				 System.out.println(element);
			 }
		 }
		 
		 // ทดลองดึงค่าในอาเรย์ 2 มิติ เอาสมาชิกตัวสุดท้ายของแต่ละแถวจากการวนลูป มาบวกกัน และแสดงผลลัพธ์จากการบวกกันบน Console
		 int mySum = 0;
		 System.out.println("Array length = " + twoD_Array.length);
		 
		for (int row = 0; row < twoD_Array.length; row++){
			   for (int element = 0; element < twoD_Array[row].length; element++){

			       System.out.print("Element[" + row + "]["+ element + "] ");
			       System.out.println(twoD_Array[row][element]);
			       
			       if (element == twoD_Array[row].length - 1) {
			    	     System.out.println("Last Element");
						 mySum = mySum + twoD_Array[row][element] ;
					 }
			     }
		 } 
		
		 System.out.println("Sum last value = " + mySum );
	}
}
