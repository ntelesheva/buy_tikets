package dao;

public interface GenericDao<T> {
    boolean save(T object);

    boolean delete(T object);

    T findById(Integer id);

    boolean update(Integer id, T newObject);
}