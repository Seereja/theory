package collection.sber.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static List<Book> bookList = new ArrayList<>();
    private static List<Author> authorList = new ArrayList<>();

    public static List<Book> getBookList() {
        return bookList;
    }

    public static void setBookList(List<Book> bookList) {
        Library.bookList = bookList;
    }

    public static List<Author> getAuthorList() {
        return authorList;
    }

    public static void setAuthorList(List<Author> authorList) {
        Library.authorList = authorList;
    }
}
