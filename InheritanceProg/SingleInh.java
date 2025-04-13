package InheritanceProg;
class Add{
	 
	  int add(int a, int b)
	 {
		 return a+b;
	 }	
}
class Answer extends Add{
	
	
	int name(String z)
	{
		return z.length();
	}
}
public class SingleInh {

	public static void main(String[] args) {
		
	Answer obj=new Answer();
	
	System.out.println(obj.add(8,8));
	System.out.println(obj.name("Saurabh"));

	}
}
