package shop.dao.impl;


import shop.dao.SaleDAO;
import shop.entity.Sale;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class SaleDAOImpl implements SaleDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Sale> getAll() {
        return (List<Sale>) entityManager
                .createQuery("FROM Sale as s ORDER BY s.idS")
                .getResultList();
    }

    @Override
    public Sale getById(int id) {
        return entityManager.find(Sale.class, id);
    }

    @Override
    public Integer add(Sale buyer) {
        entityManager.persist(buyer);
        return buyer.getIdS();
    }

    @Override
    public void update(Sale sale) {
        Sale s = getById(sale.getIdS());
        s.setNumberS(sale.getNumberS());
        s.setSum(sale.getSum());
       // s.setPayment(sale.getPayment());
        s.setDate(sale.getDate());
        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getById(id));
    }
}
