package shop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.entity.Discount;
import shop.services.DiscountService;

import java.util.List;

@RestController
@RequestMapping(value = "/discount")
public class DiscountRestController {

    @Autowired
    private DiscountService discountService;

    @PutMapping
    public boolean update(@RequestBody Discount discount) {
        return discountService.update(discount);
    }

    @PostMapping
    public Integer save(@RequestBody Discount discount) {
        return discountService.add(discount);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable(value = "id", required = true) Integer id) {
        return discountService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Discount getById(@PathVariable(value = "id") Integer id) {
        return discountService.getById(id);
    }

    @GetMapping
    public List<Discount> getAll() {
        return discountService.getAll();
    }
}
