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
    public void update(@RequestBody Buyer buyer){
        buyerService.update(buyer);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id){
        buyerService.delete(id);
    }
}
