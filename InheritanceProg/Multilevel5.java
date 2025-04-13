package InheritanceProg;

class Grandfather {
    void showGrandfather() {
        System.out.println("I am the Grandfather");
    }
}

class Father extends Grandfather {
    void showFather() {
        System.out.println("I am the Father");
    }
}

class Son extends Father {
    void showSon() {
        System.out.println("I am the Son");
    }
}

public class Multilevel5 {
    public static void main(String[] args) {
        Son s = new Son();
        s.showGrandfather(); 
        s.showFather();     
        s.showSon();         
    }
}

