package Impl;


import DAO.ProductDAO;
import Entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public class ProductDAOImpl implements ProductDAO {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> getAll() {
        return (List<Product>) entityManager
                .createQuery("FROM Product as p ORDER BY p.idPr")
                .getResultList();
    }

    @Override
    public Product getById(int id) {
        return entityManager.find(Product.class, id);
    }

    @Override
    public Integer add(Product product) {
        entityManager.persist(product);
        return product.getIdPr();
    }

    @Override
    public void update(Product product) {
        Product p = getById(product.getIdPr());
        p.setNamePr(product.getNamePr());
        p.setDescPr(product.getDescPr());
        p.setPrice(product.getPrice());
        p.setStock(product.getStock());

        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getById(id));
    }
}
