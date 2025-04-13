package InheritanceProg;
class Man {
    void manMethod() {
        System.out.println("Method from Man");
    }
}

class Boy extends Man {
    void boyMethod() {
        System.out.println("Method from Boy");
    }
}

class Children extends Boy {
    void childrenMethod() {
        System.out.println("Method from Children");
    }
}

class Implimentation extends Children {
    void implimentationMethod() {
        System.out.println("Method from Implimentation");
    }
}

public class MultiLevel3 {
    public static void main(String[] args) {
        Implimentation obj = new Implimentation();
        
        obj.manMethod();         
        obj.boyMethod();          
        obj.childrenMethod();      
        obj.implimentationMethod(); 
    }
}