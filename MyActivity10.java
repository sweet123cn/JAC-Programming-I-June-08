package package_June08;

import java.util.Scanner;

public class MyActivity10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		
		System.out.print("Input first integer: ");
		
		int x = kb.nextInt();
		
		System.out.print("Input second integer: ");
		
		int y = kb.nextInt();
		
		System.out.println("the first integer = " + x);
		System.out.println("the second integer = " + y);
		
		int z = x;
		x = y;
		y = z;
		
		System.out.println("after swap ");
		System.out.println("the first integer = " + x);
		System.out.println("the second integer = " + y);
		
		
		kb.close();
	}

}
