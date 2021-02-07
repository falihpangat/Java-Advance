package simple;

import java.util.Scanner;

public class Sumoftwo {
 public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	 int num1 , num2;
	 
	 System.out.println("enter the first number");
	 num1 = sc.nextInt();
	 System.out.println("enter the second number");
	 num2 = sc.nextInt();
	 
	 int sum = num1 + num2 ; 
	  
	 System.out.println("sum of the two number is: " + sum );
}
}
