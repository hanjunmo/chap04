
public class Exercise4_4 {
	
//	1+(-2)+3+(-4)+... , 과 같은 식으로 계속 더해나갔을 때 몇까지 더해야 총합이
//	100 .
	public static void main(String[] args) {
		
		
		int i=0;
		int sum =0;
		
		while(sum < 100) {
			i++;
			if (i%2==0)
				sum -= i; // even
			else
				sum += i; // odd
				
		}
		
		System.out.println(i);
	}
	
}

    