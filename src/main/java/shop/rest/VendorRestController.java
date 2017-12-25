package shop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.entity.Vendor;
import shop.services.VendorService;

import java.util.List;

@RestController
@RequestMapping(value = "/vendor")
public class VendorRestController {
    
    @Autowired
    private VendorService vendorService;

    @PutMapping
    public boolean update(@RequestBody Vendor vendor) {
        return vendorService.update(vendor);
    }

    @PostMapping
    public Integer save(@RequestBody Vendor vendor) {
        return vendorService.add(vendor);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable(value = "id", required = true) Integer id) {
        return vendorService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Vendor getById(@PathVariable(value = "id") Integer id) {
        return vendorService.getById(id);
    }

    @GetMapping
    public List<Vendor> getAll() {
        return vendorService.getAll();
    }
}
