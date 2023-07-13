
public class ForStatemenentExample {
	
      public static void main(String[] args) {
         int evenSum = 0;
         int oddSum = 0;
    	  for (int i=0; i<=100; i++) {
			if (i%2==0)
				evenSum += i;
			else
				oddSum = oddSum + i;
		}
    	  
    	  System.out.println("evenSum=" + evenSum);
    	  System.out.println("oddSum=" +  oddSum);
	}
	
	
	
	
	public static void main5(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=100; i+=2) {
			sum = sum + i;
//			System.out.println(i);
			
		}
		
		   System.out.println(sum); 
			   
		   }
				
			
		
		
		 
		   
    
	public static void main4(String[] args) {
		
		for(;;)    // 무한 루프
			System.out.println("...");
	}
	
	
    public static void main3(String[] args) {
		
      	for (int i=1; i<=100_000_000; i++) { 
    		System.out.println(i); 
    	}
	}
	
	public static void main2(String[] args) {
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println(4);
		System.out.println(5);
		System.out.println(6);
		System.out.println(7);
		System.out.println(8);
		System.out.println(9);
		System.out.println(10);
	}

}
