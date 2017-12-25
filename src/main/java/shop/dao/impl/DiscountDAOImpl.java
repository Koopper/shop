package shop.dao.impl;

import shop.dao.DiscountDAO;
import shop.entity.Discount;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository
public class DiscountDAOImpl implements DiscountDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Discount> getAll() {
        return (List<Discount>) entityManager
                .createQuery("FROM Discount as d ORDER BY d.idDis")
                .getResultList();
    }

    public Discount getByBuyerAndProduct(String productName, String buyerLogin) {
        return (Discount) entityManager
                .createQuery("FROM Discount as d WHERE d.product.namePr = :productName AND d.buyer.loginB = :buyerLogin")
                .setParameter("productName","%" + productName + "%")
                .setParameter("buyerLogin","%" + buyerLogin + "%");

    }

    @Override
    public Discount getById(int id) {
        return entityManager.find(Discount.class, id);
    }

    @Override
    public Integer add(Discount discount) {
        entityManager.persist(discount);
        return discount.getIdDis();
    }

    @Override
    public void update(Discount discount) {
        Discount d = getById(discount.getIdDis());
        d.setNameDis(discount.getNameDis());
        d.setNameDis(discount.getNameDis());

        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getById(id));
    }
}
