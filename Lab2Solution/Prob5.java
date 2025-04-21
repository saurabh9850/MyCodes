package Lab2Solution;

import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		System.out.println("Enter Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a>0)
			System.out.println("Positive Number");
		else if(a<0)
			System.out.println("Negative Number");
		else
			System.out.println("Number is Zero");
		

	}

}
