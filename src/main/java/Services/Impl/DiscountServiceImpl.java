package Services.Impl;

import DAO.DiscountDAO;
import Entity.Discount;
import Services.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */

@Service
public class DiscountServiceImpl implements DiscountService {
    @Autowired

    private DiscountDAO discountDAO;

    @Override
    public List<Discount> getAll() {
        return discountDAO.getAll();
    }

    @Override
    public Discount getById(int id) {
        return discountDAO.getById(id);
    }

    @Override
    public Integer add(Discount discount) {
        return discountDAO.add(discount);
    }

    @Override
    public boolean update(Discount discount) {
        discountDAO.update(discount);
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean discountExists = discountDAO.getById(id) != null;

        if (!discountExists) {
            return false;
        }

        discountDAO.delete(id);
        return true;
    }

}
