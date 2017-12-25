package shop.dao;

import shop.entity.Sale;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface SaleDAO {
    List<Sale> getAll();

    Sale getById(int id);

    Integer add(Sale sale);

    void update(Sale sale);

    void delete(int id);
}
