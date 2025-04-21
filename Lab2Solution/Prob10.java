package Lab2Solution;

import java.util.Scanner;

public class Prob10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;

        do {
            sum += num % 10;
            num = num / 10;
        } while (num != 0);

        System.out.println("Sum of digits: " + sum);
    }

	}


