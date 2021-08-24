package day2;

public class Lab12 {

	public static void main(String[] args) {
	// String1 = ‘You and Me’ , String2 = ‘ you and me ‘
	
		String String1 = "You and Me" ;
		String String2 = " you and me " ; 
		
		// Equals ทดลองเปรียบเทียบ String 2 String ว่าเป็นค่าเดียวกันหรือไม่
		if (String1.equals(String2)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
		
		// ใช้คำสั่งค้นหาคำใน String และแสดงคำที่ค้นหาบนหน้าจอ
		String findWord = "Me" ;
		if (String1.contains(findWord)) {
			System.out.println("Found " + findWord);
		} else {
			System.out.println("Not found " + findWord);
		}
		
		// ใช้คำสั่งหาความยาวของ String นั้น และแสดงค่าความยาว String 
		// int st1Length = String1.length();
		// int st2Length = String2.length();
		System.out.println(String1 + " length = " + String1.length());
		System.out.println(String2 + " length = " + String2.length());
		
		// 	ใช้คำสั่งตัดข้อความหรือตัด String ตำแหน่งที่ 1-4 ออก
		System.out.println(String1.substring(4));
		
		// 	ใช้คำสั่งตัดช่องว่างของประโยค
		System.out.println("trim=" + String2.trim());
		
		// 	ใช้คำสั่งเปลี่ยน String เป็นพิมพ์ใหญ่ทั้งหมด
		System.out.println("TO Upper Case=" + String2.toUpperCase());
		
		// ใช้คำสั่งเปลี่ยน String2 เป็นพิมพ์ใหญ่ทั้งหมด และ ไม่มีช่องว่างซ้ายขวา ด้วยการเขียน code แค่บรรทัดเดียว (ใช้ Chaining นั่นเอง)
		System.out.println("TO Upper Case and Trim=" + String2.toUpperCase().trim());
		
	}
}
