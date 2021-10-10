import java.awt.*;
import java.util.ArrayList;

public class Book {
    private String name;
    private String paragraph;
    private String image;
    private String table;
    private ArrayList<String> paragraphList= new ArrayList<String>();
    private ArrayList<String> imageList= new ArrayList<String>();
    private ArrayList<String> tableList= new ArrayList<String>();

    public Book(String name, String paragraph, String image) {
        this.name = name;
        this.paragraph = paragraph;
        this.image = image;
    }

    public Book(String name) {
        this.name = name;
    }

    public void createNewParagraph(String s) {
        paragraphList.add(s);
    }

    public void createNewImage(String s) {
        imageList.add(s);
    }

    public void createNewTable(String s) {
        tableList.add(s);
    }

    public void print() {
       System.out.println("Name of book: " + name);
        System.out.println("Paragraphs: " + paragraphList);
        System.out.println("Images: " + imageList);
        System.out.println("Tables: " + tableList);
    }
}
