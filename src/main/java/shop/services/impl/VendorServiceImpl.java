package shop.services.impl;

import shop.dao.VendorDAO;
import shop.entity.Vendor;
import shop.services.VendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VendorServiceImpl implements VendorService {
    @Autowired
    private VendorDAO vendorDAO;

    @Override
    public List<Vendor> getAll() {
        return vendorDAO.getAll();
    }

    @Override
    public Vendor getById(int id) {
        return vendorDAO.getById(id);
    }

    @Override
    public Integer add(Vendor vendor) {
        return vendorDAO.add(vendor);
    }

    @Override
    public boolean update(Vendor vendor) {
        vendorDAO.update(vendor);
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean sellerExists = vendorDAO.getById(id) != null;

        if (!sellerExists) {
            return false;
        }

        vendorDAO.delete(id);
        return true;
    }
}
