package day2;

public class Lab6 {
	
		public static void main(String[] args) {
		
		// for(int counter=0; counter <=10; counter++) {
		// 	System.out.println("Counter:" + counter);
		// }
			
			// 1
			int i = 1;
			
			while (i <= 10) {
				System.out.println("Counter " + i);
				i++ ;
			}

			// 2 - sum 1 to 10
			int sumI = 0 ;
			int j = 1;
			
			while (j <= 10) {
				sumI += j;
				System.out.println("Sum = " + sumI);
				j++ ;
			}

			//3  - % 12 = 0  (% = หารเอาเศษ)
			// ArrayList<Integer> resultList = new ArrayList<Integer>() ;
			int counter3 = 1;
			
			while (counter3 <= 100) {

				if (counter3 % 12 == 0) {
					System.out.println("Mod 12 OK -> " + counter3);
					// resultList.add(counter3);
				}

				counter3++ ;
			}
			
			
			// 4 for
			int [] pageNumber = {1,2,3,4,5};
			for (int a = 0; a < pageNumber.length; a++) {
				System.out.println(pageNumber[a]);
			}
			
			// 4 foreach
			for (int myNumber: pageNumber) {
				System.out.println("foreach - " + myNumber);
			}
			
			// 4 foreach , for loop for array
			String [] friends = {"BNB" , "SXP", "BTC"};
			for (String myFriend: friends) {
				System.out.println(myFriend);
			}
			
			
		}
}
