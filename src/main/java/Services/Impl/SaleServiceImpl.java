package Services.Impl;

import DAO.DiscountDAO;
import DAO.SaleDAO;
import Entity.Buyer;
import Entity.Discount;
import Entity.Product;
import Entity.Sale;
import Services.SaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class SaleServiceImpl implements SaleService {
    @Autowired
    private SaleDAO saleDAO;
    private DiscountDAO discountDAO;

    @Override
    public List<Sale> getAll() {
        return saleDAO.getAll();
    }

    @Override
    public Sale getById(int id) {
        return saleDAO.getById(id);
    }


    @Override
    public Integer add(Sale sale) {
        sale.setSum(calculateSum(sale));
        return saleDAO.add(sale);
    }

    @Override
    public boolean update(Sale sale) {
        sale.setSum(calculateSum(sale));
        saleDAO.update(sale);
        return true;
    }

    @Override
    public boolean delete(int id) {
        saleDAO.delete(id);
        return true;
    }

    public int calculateSum(Sale sale) {
        int sum = 0;

        Product product = sale.getProduct();
        Buyer buyer = sale.getBuyer();
        if (product != null) {
            if(product.getStock()>= sale.getNumberS()) {
                sum = sale.getNumberS() * product.getPrice();
                Discount discount = discountDAO.getByBuyerAndProduct(product.getNamePr(),buyer.getLoginB());
                if (discount!=null)
                {
                    sum = sum - discount.getSum();
                }
            }
        }
        return sum;
    }
}
