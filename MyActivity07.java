package package_June08;

import java.util.Random;

public class MyActivity07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random(); 
	      
	      int upperbound = 22;
	      
	      
	      for (int i = 1; i <= 10; i++ )
	      {
	    	 int int_random = 1 + rand.nextInt(upperbound);
	    	 System.out.println("Random number between 1 to 22 :" + int_random);
	      }
	      
	      
	}

}
