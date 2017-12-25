package shop.services.impl;

import shop.dao.BuyerDAO;
import shop.entity.Buyer;
import shop.services.BuyerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BuyerServiceImpl implements BuyerService {
    @Autowired

    private BuyerDAO buyerDAO;

    @Override
    public List<Buyer> getAll() {
        return buyerDAO.getAll();
    }

    @Override
    public Buyer getById(int id) {
        return buyerDAO.getById(id);
    }

    @Override
    public Integer add(Buyer buyer) {
        boolean buyerExists = buyerExists(buyer.getLoginB());

        if (buyerExists) {
            return null;
        }

        return buyerDAO.add(buyer);
    }

    @Override
    public boolean update(Buyer buyer) {
        Buyer loginOwner = buyerDAO.getByLogin(buyer.getLoginB());

        if (loginOwner != null && !loginOwner.getIdB().equals(buyer.getIdB())) {
            return false;
        }

        buyerDAO.update(buyer);
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean buyerExists = buyerDAO.getById(id) != null;

        if (!buyerExists) {
            return false;
        }

        buyerDAO.delete(id);
        return true;
    }

    @Override
    public boolean buyerExists(String login) {
        return buyerDAO.getByLogin(login) != null;
    }
}
