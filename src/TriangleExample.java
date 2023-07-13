
public class TriangleExample {
	
	public static void main(String[] args) {
		for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++);
			  System.out.printf("*");
		System.out.println();
	  }
		/*
		 * 1.    2.      3.       4.
		 * *     *****   *****          *
		 * **     ****   ****          **
		 * ***     ***   ***          ***
		 * ****     **   **          ****
		 * *****     *   *          *****
		 * 
		 */
		System.out.println("1번.");
		for  (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("");
			}
			for (int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("2번.");
		for  (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<5-i; k++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
			
			System.out.println("3번");
			for (int i=0; i<5; i++) {
				for (int j=0; j<5-i; j++) {
					System.out.print("*");
				}
				for (int k=0; k<i; k++) {
					System.out.print(" ");
				}
				System.out.println();
			}


for (int i=0; i<5; i++) {
			for (int j=0; j<5; j++)
			  System.out.printf("*");
		System.out.println();
	  }
		/*
		 * 1.    2.      3.       4.
		 * *     *****   *****          *
		 * **     ****   ****          **
		 * ***     ***   ***          ***
		 * ****     **   **          ****
		 * *****     *   *          *****
		 * 
		 */
		System.out.println("1번.");
		for  (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print("");
			}
			for (int k=0; k<4-i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("2번.");
		for  (int i=0; i<5; i++) {
			for (int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for (int k=0; k<5-i; k++) {
				System.out.print("*");
			}
			System.out.println(); 
		}
			
			System.out.println("3번");
			for (int i=0; i<5; i++) {
				for (int j=0; j<5-i; j++) {
					System.out.print("*");
				}
				for (int k=0; k<i; k++) {
					System.out.print(" ");
				}
				System.out.println();
			}
	}
}