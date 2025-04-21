package Lab1Solution;
 class SameMethod1 {
	
	public void Play()
	{
		System.out.println("Play");
	}

} 
public class SameMethod {
	public void Play()
	{
		System.out.println("Play");
	}

	public static void main(String[] args) 
	{
     SameMethod1 same=new SameMethod1();
     SameMethod obj=new SameMethod();
     obj.Play();
     same.Play();


	}

}
