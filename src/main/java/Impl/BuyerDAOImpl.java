package Impl;

import DAO.BuyerDAO;
import Entity.Buyer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public class BuyerDAOImpl implements BuyerDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Buyer> getAll() {
        return (List<Buyer>) entityManager
                .createQuery("FROM Buyer as b ORDER BY b.idB")
                .getResultList();
    }

    @Override
    public Buyer getById(int id) {
        return entityManager.find(Buyer.class, id);
    }

    @Override
    public Integer add(Buyer buyer) {
        entityManager.persist(buyer);
        return buyer.getIdB();
    }

    @Override
    public void update(Buyer buyer) {
        Buyer b = getById(buyer.getIdB());
        b.setFioB(buyer.getFioB());
        b.setEmailB(buyer.getEmailB());
        b.setLoginB(buyer.getLoginB());
        b.setPhoneB(buyer.getPhoneB());
        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getById(id));
    }

    @Override
    public Buyer getByLogin(String login) {
        List resultList = entityManager.createQuery("FROM Buyer as b WHERE b.loginB = :login")
                .setParameter("login", login)
                .getResultList();

        if (resultList.size() == 0) {
            return null;
        }

        return (Buyer) resultList.get(0);
    }
}
