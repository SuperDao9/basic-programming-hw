package day2;

public class Lab4 {
	public static void main(String[] args) {
		int score = 55;
		boolean isHandSome = true;
		
		System.out.println("Your score = " + score +"\n");
		// Only score, 
		System.out.println("Only Score >=80 is GOOD : ");
		if(score >=80){
			System.out.println("Good");
		}else if (score >=50) {
			System.out.println("Normal");
		}else if(score < 50) {
			System.out.println("Fail");
		}
		
		// If Handsome, all good
		System.out.println("\nScore >=80 is GOOD, Score >=50 and HandSome is GOOD : ");
		if(isHandSome) {
			System.out.println("Good HandSome");
		} else {
			if(score >= 80) {
				System.out.println("Good");
			}else if(score >=50){
				System.out.println("Good");
			} else if (score >=50) {
				System.out.println("Normal");
			}else if(score < 50) {
				System.out.println("Fail");
			}
		}
	

		// Good if >= 80, If Handsome && >=50, then Good
		System.out.println("\nIf HandSome is GOOD, or score >=80 : ");
		if(score >= 80) {
			System.out.println("Good");
		}else if ((score >=50) && isHandSome) {
			System.out.println("Good HandSome");
		} else if (score >=50) {
			System.out.println("Normal");
		} else if (score < 50) {
			System.out.println("Fail");
		}
		
		// 7-eleven
		// int wallet = 50;
		// if(wallet > 40) {
		// 	System.out.println("Gold Member");
		// }
	}
}
