package DAO;

import Entity.Product;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface ProductDAO {
    List<Product> getAll();

    Product getById(int id);

    Integer add(Product product);

    void update(Product product);

    void delete(int id);
}
