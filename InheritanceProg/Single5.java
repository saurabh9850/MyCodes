package InheritanceProg;
class Animals {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog is barking");
    }
}


public class Single5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dogs d = new Dogs();
        d.eat();   // Inherited from Animal
        d.bark();

	}

}
