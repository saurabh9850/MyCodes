package InheritanceProg;


class Play{
	
	void play()
	{
		System.out.println("Lets Play");
	}
}
class Study extends Play{
      void study()
  {
	
       System.out.println("Lets Study");
   }

}

public class Single3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Study ob=new Study();
		ob.study();
		ob.play();

	}

}
