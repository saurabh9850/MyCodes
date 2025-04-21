package Lab2Solution;

public class Prob21 {

	public static void main(String[] args) {
		int end=5;
		int space=4; 
		for(int i=1;i<=5;i++)
		{ int cnt=1;
			for(int j=1;j<=end;j++)
			{   if(j<=space)
				System.out.print("  ");
			else
			{
				if(j<5)
				{
					System.out.print(cnt+" ");
					cnt++;
				}
				else
					{System.out.print(cnt+" ");
				cnt--;}
			}
			}System.out.println();
			end++;
			space--;
		}

	}

}
