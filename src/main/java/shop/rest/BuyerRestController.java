package shop.rest;

import shop.entity.Buyer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.services.BuyerService;

import java.util.List;

@RestController
@RequestMapping(value = "/buyer")
public class BuyerRestController {

    @Autowired
    private BuyerService buyerService;

    @GetMapping
    public List<Buyer> getBuyers(){
        return buyerService.getAll();
    }

    @PutMapping
    public boolean update(@RequestBody Buyer buyer){
        return buyerService.update(buyer);
    }

    @PostMapping
    public Integer save(@RequestBody Buyer buyer){
        return buyerService.add(buyer);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable(value = "id", required = true) Integer id){
       return buyerService.delete(id);
    }

    @GetMapping(value = "/{id}")
    public Buyer getById(@PathVariable(value = "id", required = true)Integer id){
        return buyerService.getById(id);
    }
}
