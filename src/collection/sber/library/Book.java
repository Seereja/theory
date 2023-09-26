package collection.sber.library;

import java.util.Objects;

public class Book {
    private int id;
    private String nameBook;
    private String Author;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Book(int id, String nameBook, String author) {
        this.id = id;
        this.nameBook = nameBook;
        Author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", Author='" + Author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (getClass() != o.getClass()) {
            return false;
        }
        Book book = (Book) o;
        return Objects.equals(getNameBook(), book.getNameBook())
                && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameBook(), getAuthor());
    }
}
