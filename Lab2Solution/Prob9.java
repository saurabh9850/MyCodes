package Lab2Solution;

import java.util.Scanner;

public class Prob9 {

	public static void main(String[] args) {
		System.out.println("Enter Numbers");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
			System.out.println("Maximun "+a);
		if(b>a && b>c )
			System.out.println("Maximum "+b);
		if(c>a && c>b)
			System.out.println("Maximum "+c);
	}

}
