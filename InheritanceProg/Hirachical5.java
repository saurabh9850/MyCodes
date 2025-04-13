package InheritanceProg;

class Book {
    void read() {
        System.out.println("Reading a book");
    }
}

class StoryBook extends Book {
    void tellStory() {
        System.out.println("This is a story book.");
    }
}

class TextBook extends Book {
    void study() {
        System.out.println("This is a textbook.");
    }
}

public class Hirachical5 {
    public static void main(String[] args) {
        StoryBook story = new StoryBook();
        story.read();       
        story.tellStory(); 

        TextBook text = new TextBook();
       
        text.read();  
        text.study();    
    }
}
