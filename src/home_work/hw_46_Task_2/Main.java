package home_work.hw_46_Task_2;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();

        library.addBook(new Book("Приключения Тома Сойера", "Марк Твен"));
        library.addBook(new Book("1984", "Джордж Оуел"));
        library.addBook(new Book("Мастер и Маргарита", "Михаил Булгаков"));

        String searchTitleFound = "1984";

        Optional<Book> foundBook = library.finfBookByTitle(searchTitleFound);

        if (foundBook.isPresent()) {

            System.out.println("Книга найдена: " + foundBook.get());

        } else {
            System.out.println("Книга '" + searchTitleFound + "' не найдена.");
        }
        System.out.println("-------");

        String searchTitleNotFound = "Гарри Поттер";

        Optional<Book> notFoundBook = library.finfBookByTitle(searchTitleFound);

        if (notFoundBook.isPresent()) {
            System.out.println("Книга найдена: " + notFoundBook.get());
        } else  {
            System.out.println("Книга '" + searchTitleNotFound + "' не найдена.");
        }
    }
}
