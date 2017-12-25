package Impl;

import DAO.VendorDAO;
import Entity.Vendor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Repository

public class VendorDAOImpl implements VendorDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Vendor> getAll() {
        return (List<Vendor>) entityManager
                .createQuery("FROM Vendor as v ORDER BY v.idV")
                .getResultList();
    }

    @Override
    public Vendor getById(int id) {
        return entityManager.find(Vendor.class, id);
    }

    @Override
    public Integer add(Vendor vendor) {
        entityManager.persist(vendor);
        return vendor.getIdV();
    }

    @Override
    public void update(Vendor vendor) {
        Vendor v = getById(vendor.getIdV());
        v.setFioV(vendor.getFioV());
        v.setPhoneV(vendor.getPhoneV());

        entityManager.flush();
    }

    @Override
    public void delete(int id) {
        entityManager.remove(getById(id));
    }
}
