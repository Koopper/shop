package shop.services;

import shop.entity.Buyer;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface BuyerService {
    List<Buyer> getAll();

    Buyer getById(int id);

    Integer add(Buyer buyer);

    boolean update(Buyer buyer);

    boolean delete(int id);

    boolean buyerExists(String login);
}
