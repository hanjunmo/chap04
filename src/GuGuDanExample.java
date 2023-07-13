
public class GuGuDanExample {
	
    public static void main(String[] args) {
	    int count= 0;
    	for (int x=1; x<100; x++)
    		for (int y=1; y<=100; y++)
    			for (int z=1; z<=100; z++) {
     				count++;
    			    System.out.printf("[%3d, %3d, %3d]\n", x, y, z);
    				}
    	 System.out.println(count);
    	 
    	 
	}
	
	public static void main4(String[] args) {
	for (int dan=1; dan<10; dan++ ) {
	     System.out.println(dan + "단");
		for (int i=1; i<10; i++) {
			if (dan*i%2==0)
			System.out.printf("%d X %d = %2d\n", dan, i, dan*i);
		}
	}
}


		
		
	
	
	
	public static void main3(String[] args) {
		
		int count=0;
		
		for (int dan=1; dan<10; dan++) {
			for (int i=1; i<10; i++) {
				count++;
				
			}
		}
		
		System.out.println(count);
		
	}
	

	public static void main2(String[] args) {
		
        System.out.println("1단");
		 for (int i=1; i<10; i++)
        	System.out.printf("1 X %d = %2d\n", i, i);
		 
		 System.out.println("1단");
		 for (int i=1; i<10; i++)
        	System.out.printf("2 X %d = %2d\n", i, 2*i);
		 
		 System.out.println("3단");
		 for (int i=1; i<10; i++)
        	System.out.printf("3 X %d = %2d\n", i, 3*i);
	}

}
