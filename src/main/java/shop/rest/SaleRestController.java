package shop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.entity.Sale;
import shop.services.SaleService;

import java.util.List;

@RestController
@RequestMapping(value = "/sale")
public class SaleRestController {
    
    @Autowired
    private SaleService saleService;

    @PutMapping
    public boolean update(@RequestBody Sale sale) {
        return saleService.update(sale);
    }

    @PostMapping
    public Integer save(@RequestBody Sale sale) {
        return saleService.add(sale);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable(value = "id", required = true) Integer id) {
        return saleService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Sale getById(@PathVariable(value = "id") Integer id) {
        return saleService.getById(id);
    }

    @GetMapping
    public List<Sale> getAll() {
        return saleService.getAll();
    }
}
