
public class Exercise4_10 {

	public static void main(String[] args) {
         int num1 = 1;
         int num2 = 1;
         int num3 = 0;
         
         System.out.println(num1 + "," + num2);
         
         for (int i=0; i<18; i++) {
        	 num3 = num1 + num2;
        	 System.out.println("," + num3);
        	 num1 = num2;
        	 num2 = num3;
         }
	}
}
     