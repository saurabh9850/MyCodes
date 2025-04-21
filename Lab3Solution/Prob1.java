package Lab3Solution;
class A{
	private int x=1;
	private int y=5;
	private int add() {
		return x+y;
	}
	
}

public class Prob1 extends A {

	public static void main(String[] args) {
		Prob1 obj=new Prob1();
		//System.out.println(obj.add());  //so here we can access the variable
		
		
		

	}
	class B{
		public static void main(String[]args) {
			A ob=new A();
			System.out.println(ob.add());  // so here method is not visibe
			
			//The scope of private is only within the class
			
		}
		
		
	}

}
