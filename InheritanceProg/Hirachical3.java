package InheritanceProg;

class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Circle extends Shape {
    void drawCircle() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void drawRectangle() {
        System.out.println("Drawing a Rectangle");
    }
}

class Triangle extends Shape {
    void drawTriangle() {
        System.out.println("Drawing a Triangle");
    }
}

public class Hirachical3 {
    public static void main(String[] args) {
        Circle c = new Circle();
        
        c.draw();         
        c.drawCircle();  
        Rectangle r = new Rectangle();
        r.draw();         
        r.drawRectangle(); 
        Triangle t = new Triangle();
      
        t.draw();         
        t.drawTriangle(); 
    }
}
