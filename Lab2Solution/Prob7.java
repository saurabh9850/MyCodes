
package Lab2Solution;

import java.util.Scanner;

public class Prob7 {

	
		public static void main(String[] args) {
			Scanner n=new Scanner(System.in);
			System.out.println("Enter Number ");
			int a=n.nextInt();
			int z=a%2;
			if(z==0)
				System.out.println("Even Number "+z) ;
			else {
				System.out.println("odd Number "+z);
				
			}

	}

}
