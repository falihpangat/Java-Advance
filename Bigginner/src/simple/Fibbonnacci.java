package simple;

import java.util.Scanner;

public class Fibbonnacci {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int n1=0,n2=1,n3,i;
	 for( i=2; i<=n; ++i) {
		 n3=n1+n2;
		 System.out.println(""+n3);
		 n1=n2;
		 n2=n3;
	 }
		 
	 
}
}
