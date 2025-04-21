package Lab1Solution;

public class EX7 {

	public static void main(String[] args) {
		System.out.println("A Main");
		m1();

	}

	public static void m1() {
		System.out.println("A m1()");
		main(new String[0]);   //Stack overFlow infinite recursion.
		
	}

}
