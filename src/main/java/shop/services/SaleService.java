package shop.services;

import shop.entity.Sale;

import java.util.List;


public interface SaleService {
    List<Sale> getAll();

    Sale getById(int id);

    Integer add(Sale sale);

    boolean update(Sale sale);

    boolean delete(int id);

    int calculateSum(Sale sale);
}
