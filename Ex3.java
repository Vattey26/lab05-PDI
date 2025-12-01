class Book
{
    private String author;
    private String title;
    private double price;

    public Book()
    {
        this.title = "None";
        this.author = "None";
        this.price = 0.0;
    }

    public Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.printf("Title: %s\nAuthor: %s\nPrice: %.2f\n", title, author, price);
    }
}

public class Ex3 {
    public static void main(String[] args)
    {
        Book b1 = new Book();
        Book b2 = new Book("Java for Dummy", "IT Students", 25.00);
        Book b3 = new Book("Humor 101", "Comedian", 40.00);

        b1.display();
        System.out.println();
        b2.display();
        System.out.println();
        b3.display();
    }
}
