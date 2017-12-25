package DAO;

import Entity.Vendor;

import java.util.List;

/**
 * Created by tenni_000 on 25.12.2017.
 */
public interface VendorDAO {
    List<Vendor> getAll();

    Vendor getById(int id);

    Integer add(Vendor vendor);

    void update(Vendor vendor);

    void delete(int id);
}
