package collection.sber.library;

import collection.sber.library.dao.BookDao;
import collection.sber.library.dao.GenericDao;

public class Test {
    public static void main(String[] args) {
        GenericDao<Book> book = new BookDao();

        book.create(new Book(1, "Test", "Test"));
        book.create(new Book(2, "Test1", "Test1"));
        book.create(new Book(3, "Test2", "Test2"));
        System.out.println("GET_ALL");

        book.getAll().forEach((i) -> {
            System.out.println(i.getNameBook() + " " + i.getAuthor());
        });
        System.out.println();

        System.out.println("GET_BY_ID");
        System.out.println(book.getById(1).getNameBook());
        System.out.println();

        System.out.println("GET_BY_UPDATE");
        Book book1 = book.getById(2);
        book1.setNameBook("Title");
        book1.setAuthor("Author");
        book.update(book1);
        book.getAll().forEach((i) -> {
            System.out.println(i.getNameBook() + " " + i.getAuthor());
        });
        System.out.println("Deleted");
        book.deleted(1);
        book.getAll().forEach((i) -> {
            System.out.println(i.getNameBook() + " " + i.getAuthor());
        });

    }
}
