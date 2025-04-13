package InheritanceProg;

class Vehicle {
    void start() {
        System.out.println("Vehicle is starting");
    }
}

class Bike extends Vehicle {
    void rideBike() {
        System.out.println("Riding a bike");
    }
}

class Car extends Vehicle {
    void driveCar() {
        System.out.println("Driving a car");
    }
}

public class Hirachical4 {
    public static void main(String[] args) {
        Bike b = new Bike();
        
        b.start();     
        b.rideBike();  

        Car c = new Car();
        
        c.start();     
        c.driveCar();  
    }
}
