package package_June08;

import java.util.Scanner;

public class MyActivity06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		
		System.out.println("Input a Decimal Number: ");
		
		int x = kb.nextInt();
		
		System.out.println("Binary number is: " + Integer.toBinaryString(x));
		
		kb.close();
	}

}
