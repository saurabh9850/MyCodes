package Lab2Solution;

import java.util.Scanner;

public class Progr2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int a=scan.nextInt();
		if(a%2==0) {
			System.out.println("Even Number");}
		else {
			System.out.println("Odd Number");}
		scan.close();
	}

}
