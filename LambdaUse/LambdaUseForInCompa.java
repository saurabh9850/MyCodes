package LambdaUse;

import java.util.*;

class Names {
    String name;
    int age;

    Names(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+" "+age;
    }
}

public class LambdaUseForInCompa {
    public static void main(String[] args) {
        List<Names> z = new ArrayList<>();
        z.add(new Names("Saurabh", 3));
        z.add(new Names("Ajay", 1));
        z.add(new Names("Vijay", 2));

        
        //z.sort(Comparator.comparingInt(p->p.age));
        z.sort(Comparator.comparing(p->p.name));
        for (Names p : z) {
            System.out.println(p);
        }
    }
}
