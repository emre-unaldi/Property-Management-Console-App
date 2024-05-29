package repository;

import java.util.List;

public interface GenericRepository<T> {
    void add(T item);
    void remove(T item);
    List<T> findAll();
    T findById(int id);
}
