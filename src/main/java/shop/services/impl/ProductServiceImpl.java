package shop.services.impl;

import org.springframework.stereotype.Service;
import shop.dao.ProductDAO;
import shop.entity.Product;
import shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDAO productDAO;

    @Override
    public List<Product> getAll() {
        return productDAO.getAll();
    }

    @Override
    public Product getById(int id) {
        return productDAO.getById(id);
    }

    @Override
    public Integer add(Product product) {
        return productDAO.add(product);
    }

    @Override
    public boolean update(Product product) {
        productDAO.update(product);
        return true;
    }

    @Override
    public boolean delete(int id) {
        boolean productExists = productDAO.getById(id) != null;

        if (!productExists) {
            return false;
        }

        productDAO.delete(id);
        return true;
    }
}
