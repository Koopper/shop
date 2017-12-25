package shop.services;

import shop.entity.Vendor;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface VendorService {
    List<Vendor> getAll();

    Vendor getById(int id);

    Integer add(Vendor vendor);

    boolean update(Vendor vendor);

    boolean delete(int id);
}
