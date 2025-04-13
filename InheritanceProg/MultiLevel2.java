package InheritanceProg;
class Animal{
	String name;
	String getName(String name)
	{
		this.name=name;
		return name;
	}
	
}
class Dog extends Animal{
	String type;
	String getType(String type)
	{
		this.type=type;
		return type;
	}
	
	
}
class Info extends Dog{
	
	
	void info() {
		System.out.println("name: "+name+ " Type : "+type);
	}
	
	
}
public class MultiLevel2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Info ob=new Info();
		ob.getType("Jerman");
		ob.getName("Tomy");
		ob.info();

	}

}
