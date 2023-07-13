
public class ContinueStatementExample {

	public static void main(String[] args) {
		  int sum1=0; // 3의 배수의 합
		  int sum2=0; // 그 외 합
		
		
         for (int i=1; i<=100; i++) {
        	 
        	 if (i%3==0) {
        		 sum1 +=i;
        		 continue;
        	 }
        		 
        	 
        	 sum2 += i;
         }
         
         System.out.println("sum1=" );
         System.out.println("sum2=" );
	}

}
