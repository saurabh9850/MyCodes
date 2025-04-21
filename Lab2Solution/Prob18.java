package Lab2Solution;

public class Prob18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int end=6;
		int cnt1=6;
		for(int i=1;i<=6;i++)
		{ int cnt=cnt1;
			for(int j=1;j<=end;j++)
			{
				System.out.print(cnt);
				cnt--;
			}
			System.out.println();
			end--;
			cnt1--;
		}

	}

}
