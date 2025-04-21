package Lab3Solution;

import Lab2Solution.ForCondition;

public class Prob2 {

	public static void main(String[] args) {
		Prob2 obj=new Prob2();
		obj.add(12,13);//we can not access this 
		obj.min();
		obj.run();
		obj.name();
		ForCondition obj1=new ForCondition();
		obj1.add(1,2 );//we can access this bcs it is public 
		obj1.min();
		obj.run();
		obj.run();
		obj.name();
		
                //public->anywhere
		        //private->within class only
		        //protected->within package and sub class in another pkg
		        //default->within same pkg
	}

}
class A extends ForCondition{
	public static void main(String[]args) {
	A obj3=new A();
	obj3.add(1,2);//thise is public
	obj3.min();
	obj3.run();
	obj3.name();// this is protected and acceble in package and sub class 
	//in another package
	}
	
	//this answer for problem 2,3,4,5
	
	
}
