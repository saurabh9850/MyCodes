package InheritanceProg;

class Employees {
    void work() {
        System.out.println("Employee is working");
    }
}

class Developers extends Employees {
    void writeCode() {
        System.out.println("Developer is writing code");
    }
}

class Tester extends Employees {
    void testCode() {
        System.out.println("Tester is testing code");
    }
}

public class Hirachical2 {
    public static void main(String[] args) {
        Developers dev = new Developers();
        dev.work();     
        dev.writeCode(); 

        Tester tester = new Tester();
        tester.work();  
        tester.testCode(); 
    }
}

