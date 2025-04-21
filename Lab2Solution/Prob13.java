package Lab2Solution;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Number ");
		Scanner sc=new Scanner(System.in);
		List<Integer> list=new ArrayList<Integer>();
		List<Integer> list1=new ArrayList<Integer>();
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=b;i++)
		{
			if(i%2==0)
				list.add(i);
			else
				list1.add(i);
		}
		System.out.println("Even Numbers "+list);
		System.out.println("Odd Numberes "+list1);
				
		

	}

}
