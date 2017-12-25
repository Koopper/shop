package shop.services;

import shop.entity.Product;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface ProductService {
    List<Product> getAll();

    Product getById(int id);

    Integer add(Product product);

    boolean update(Product product);

    boolean delete(int id);
}
