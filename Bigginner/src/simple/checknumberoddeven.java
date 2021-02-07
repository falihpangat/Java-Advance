package simple;

import java.util.Scanner;

public class checknumberoddeven {
   public static void main(String[] args) {
	   Scanner input = new Scanner(System.in);
	   
	   while (true) {
		   System.out.println("enter the number");
		   int num = input.nextInt();
		
		if (num % 2 == 0 ) {
			System.out.println("the given number is even");
		}
		else {
			System.out.println("the given number is odd");
		}
	}
	  
}
}
