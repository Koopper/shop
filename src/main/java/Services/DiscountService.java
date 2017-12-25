package Services;

import Entity.Discount;

import java.util.List;

public interface DiscountService {
    List<Discount> getAll();

    Discount getById(int id);

    Integer add(Discount discount);

    boolean update(Discount discount);

    boolean delete(int id);
}
