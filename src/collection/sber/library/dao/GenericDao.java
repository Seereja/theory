package collection.sber.library.dao;

import collection.sber.library.Book;

import java.util.List;

public interface GenericDao<T> {
    T getById(Integer id);

    void create(T ob);

    void update(T ob);

    void deleted(Integer id);

    List<T> getAll();
}
