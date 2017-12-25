package DAO;


import Entity.Discount;

import java.util.List;

public interface DiscountDAO {

    List<Discount> getAll();

    Discount getById(int id);

    Discount getByBuyerAndProduct(String productName, String buyerLogin);

    Integer add(Discount discount);

    void update(Discount discount);

    void delete(int id);
}
