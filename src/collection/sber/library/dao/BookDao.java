package collection.sber.library.dao;

import collection.sber.library.Book;
import collection.sber.library.Library;

import java.util.ArrayList;
import java.util.List;

public class BookDao implements GenericDao<Book> {

    List<Book> books = new ArrayList<>(Library.getBookList());

    @Override
    public Book getById(Integer id) {
        for (Book book : books) {
            if (book.getId()==(id)) {
                return book;
            }
        }
        return null;
    }

    @Override
    public void create(Book ob) {
        books.add(ob);
        save(books);
    }

    @Override
    public void update(Book ob) {
        deleted(ob.getId());
        create(ob);
        save(books);
    }

    @Override
    public void deleted(Integer id) {
        books.remove(getById(id));
        save(books);
    }

    @Override
    public List<Book> getAll() {
        return Library.getBookList();
    }

    public void save(List<Book> list) {
        Library.setBookList(list);
    }
}
