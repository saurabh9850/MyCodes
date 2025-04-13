package InheritanceProg;
class Calculator{

	int add(int a,int b)
	{
		return a+b;
	}
	int diff(int a,int b)
	{
		return a-b;
	}
	
}
class Ans extends Calculator{
	
	void ans()
	{
		System.out.println("Answer is : ");
	}
	
	
}
public class Single4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ans ob=new Ans();
		ob.ans();
		System.out.println(ob.add(2,3));
		System.out.println((ob.diff(4,8)));

	}

}
