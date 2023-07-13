
public class VT100LoopingExample {

	public static void main(String[] args) throws InterruptedException {
      for (int i=0; i<5000; i++) {
    	  System.out.println("\033[2J");
          int line = (int)(Math.random()*20 + 1);
          int column = (int)(Math.random()*40 + 1);
          int fg = (int) (Math.random()*8 + 30);
          int bg = (int) (Math.random()*8 + 40);
          char ch = (char)(Math.random()*26 + 'A');
           
          System.out.printf("\033[%d;%dH", line, column);
          System.out.printf("\033[%dm", fg);
          System.out.printf("\033[%dm", bg);
          System.out.printf("%c", ch);
          Thread.sleep(10);
      }
	
	    System.out.print("\033[0m");
	    System.out.print("\033[21;1H");
	    System.out.print("Program End...");
}
}
