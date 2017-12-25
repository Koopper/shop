package shop.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shop.entity.Product;
import shop.services.ProductService;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping(value = "/product")
public class ProductRestController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping(value = "/{id}")
    public Product getById(@PathVariable(value = "id", required = true)Integer id){
        return productService.getById(id);
    }

    @PostMapping
    public int save(@RequestBody Product product){
        return productService.add(product);
    }

    @PutMapping
    public boolean update(@RequestBody Product product){
        return productService.update(product);
    }

    @DeleteMapping(value = "/{id}")
    public boolean delete(@PathVariable(value = "id", required = true)Integer id){
        return productService.delete(id);
    }
}
