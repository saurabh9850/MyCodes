package InheritanceProg;

class Java{
	int a=2;
	int b=3;	
}
class Sql extends Java{
	int add()
	{
		return a+b;
	}	
}
public class Single2 {

	public static void main(String[] args) {
		Sql obj=new Sql();
System.out.println(obj.add());
	}
}
