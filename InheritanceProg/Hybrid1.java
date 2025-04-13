package InheritanceProg;
class Books {
    void showBook() {
        System.out.println("This is a book");
    }
    
}

class StoryBooks extends Books {
    void showStory() {
        System.out.println("This is a story book");
    }
    
}

class FictionBooks extends StoryBooks {
    void showFiction() {
        System.out.println("This is a fiction book");
    }
}

class TextBooks extends Books {
    void showText() {
        System.out.println("This is a textbook");
    }
}


public class Hybrid1 {
    public static void main(String[] args) {
        
        FictionBooks fb = new FictionBooks();
        fb.showBook();    
        fb.showStory();     
        fb.showFiction();  
        TextBooks tb = new TextBooks();
        tb.showBook();     
        tb.showText();     
    }
}

