package day2;

public class Lab11 {
	// ทดลองสร้าง method แบบ Return และไม่ Return ค่า และเรียกใช้งาน method ที่สร้างขึ้น โดยให้แสดงผลลัพธ์บน Console
	public static void main(String[] args) {
		String myWord = "Dao";
		
		// Call return value method
		System.out.println(greeting(myWord));
		
		// Call void method
		sayHi(myWord);
	 }

	// Return value method
	 public static String greeting(String word) {
	 	return "Hello " + word;
	 }

	// Void method
	 public static void sayHi(String word) {
		 System.out.println("Hi Super " + word);
	 }
}
