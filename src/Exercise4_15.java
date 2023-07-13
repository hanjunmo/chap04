import java.util.Scanner;

public class Exercise4_15 {


	public static void main(String[] args) {
		int number = 101232101;
		int tmp = number;
		
		int result=0;
		
		while (tmp !=0) {
		   result *= 10;
          result = result + tmp%10;
          tmp /= 10;
		}
			
		if (result == number)
			System.out.println(result + "는 회문수 아닙니다");
		
	   }
	}
