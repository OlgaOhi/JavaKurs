package home_work.hw_46_Task_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }
    public void addBook(Book book) {
        this.books.add(book);
    }
    public Optional<Book> finfBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title)) {
                return Optional.of(book);
            }
        }
        return Optional.empty();
    }
}
