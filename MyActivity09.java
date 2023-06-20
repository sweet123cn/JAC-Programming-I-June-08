package package_June08;

import java.util.Scanner;

public class MyActivity09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb =  new Scanner(System.in);
		
		System.out.print("Input a umber: ");
		
		int x = kb.nextInt();
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(x + "x" + i + "=" + x*i);
		}
		
		kb.close();
	}

}
