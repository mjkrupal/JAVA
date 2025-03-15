public class Book {
    private String title;
    private String author;
    private double price;

    // Constructor with all parameters
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        price=20.25;
    }
    // Method to display book details
    public void display() {
        System.out.println("Title: " +title);
        System.out.println("Author: " +author);
        System.out.println("Price: " +price);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", 15.99);
        Book book2 = new Book("Brave New World", "Aldous Huxley");

        book1.display();
        book2.display();
    }
}
