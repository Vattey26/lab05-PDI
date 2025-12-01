 package Task3 ;
 public class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor (override default values)
    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    // Constructor to set book info
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
     public void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

}
