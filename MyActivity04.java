package package_June08;

import java.util.Scanner;

public class MyActivity04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		
		System.out.println("please input the first num: ");
		double x = kb.nextDouble();
		
		System.out.println("please input the second num: ");
		double y = kb.nextDouble();
		
		System.out.println("please input the third num: ");
		double z = kb.nextDouble();
		
		System.out.println("the average is : " + ((x + y + z)/3));
		
		kb.close();
		
	}

}
