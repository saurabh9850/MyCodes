package InheritanceProg;

class Mobile{
	String name="Galaxy S20";
	
}
class Samsung extends Mobile{
	int capacity=20;
}
class Battery extends Samsung
{
  	
 void info()
 {
	 System.out.println("name : "+ name +" Capacity : "+capacity);
 }
}
public class MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Battery ob=new Battery();
		ob.info();

	}

}
