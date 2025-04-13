package InheritanceProg;

class Bag {
    void carryItems() {
        System.out.println("Carry item in the bag");
    }
}
class SchoolBag extends Bag {
    void keepBooks() {
        System.out.println("Books in bag");
    }
}
class LaptopBag extends SchoolBag {
    void keepLaptop() {
        System.out.println("Laptop took in the laptop bag");
    }
}
class TravelBag extends Bag {
    void packClothes() {
        System.out.println("Clothes took in travel bag");
    }
}
public class Hybrid5 {
    public static void main(String[] args) {
       
        LaptopBag lb = new LaptopBag();
        lb.carryItems();   
        lb.keepBooks();    
        lb.keepLaptop();   

     
        TravelBag tb = new TravelBag();
        tb.carryItems();   
        tb.packClothes();  
    }
}

