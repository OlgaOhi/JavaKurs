package les_21_HomeWork;

public class Book {

    String title;
    String author;
    int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void read() {
        System.out.println("We read the book: " + title + " by " + author);
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }

    public static void main(String[] args) {
        Book book = new Book("Moments of happiness", "Onidat", 1000);
        book.displayInfo();
        book.read();
    }

}
