package InheritanceProg;

class Animalss {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dogss extends Animalss {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animalss {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Hirachical1 {
    public static void main(String[] args) {
        Dogss d = new Dogss();
       
        d.eat();  
        d.bark(); 

        Cat c = new Cat();
        
        c.eat();   
        c.meow();  
    }
}
