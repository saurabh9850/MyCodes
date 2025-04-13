package InheritanceProg;
class Employee {
    String name = "Saurabh";

    void showDetails() {
        System.out.println("Employee: " + name);
    }
}

class Developer extends Employee {
    String language = "Java";

    void showDetails() {
        super.showDetails();
        System.out.println("Developer Language: " + language);
    }
}

class TeamLead extends Developer {
    int teamSize = 5;

    void showDetails() {
        super.showDetails();
        System.out.println("Team Lead - Team Size: " + teamSize);
    }
}

class Manager extends TeamLead {
    String project = "AI Module";

    void showDetails() {
        super.showDetails();
        System.out.println("Manager - Project: " + project);
    }
}

class Director extends Manager {
    double budget = 1000000;

    void showDetails() {
        super.showDetails();
        System.out.println("Director - Budget: $" + budget);
    }
}

public class Multilevel4 {
    public static void main(String[] args) {
      
        Employee emp = new Director();
        emp.showDetails();  

        Manager mgr = new Manager();
        mgr.showDetails();  
    }
}

