package Lab1Solution;

import java.util.Arrays;

public class ArrayNegative {

	public static void main(String[] args) {
		
		int a[]= new int[-2];//so we cant pass -Ve value as length
		int z=0;
		for(int i=0;i<10;i++)
		{
			a[z++]=i;
		}
		System.out.println(Arrays.toString(a));
	}

}
