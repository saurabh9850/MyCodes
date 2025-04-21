package Lab1Solution;

public class MethodCalling {
	void name()
	{
		System.out.println("Saurabh");
	}
	public void Read()
	{
		name();
	}

	public static void main(String[] args) {
		
           MethodCalling n=new MethodCalling();
               n.Read();
	}

}
