package shop.dao;

import shop.entity.Buyer;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface BuyerDAO {
    List<Buyer> getAll();

    Buyer getById(int id);

    Buyer getByLogin(String login);

    Integer add(Buyer buyer);

    void update(Buyer buyer);

    void delete(int id);
}
