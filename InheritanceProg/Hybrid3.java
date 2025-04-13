package InheritanceProg;

class Pen {
    void write() {
        System.out.println("Writing with a pen");   }
}
class GelPen extends Pen {
    void smoothWriting() {
        System.out.println("Smooth writing with gel pen");
    }
}

class ColorGelPen extends GelPen {
    void showColor() {
        System.out.println("This gel pen has blue ink");
    }
}
class BallPen extends Pen {
    void clickAction() {
        System.out.println("Click action of ball pen");
    }
}
public class Hybrid3 {
    public static void main(String[] args) {
                ColorGelPen cg = new ColorGelPen();
        cg.write();          
        cg.smoothWriting();     
        cg.showColor();      

        
        BallPen bp = new BallPen();
        bp.write();          
        bp.clickAction();    
    }
}
