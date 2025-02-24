package ee.dianaV.online.controller;

//võimaldab Sping Web seda teha, et tekitada API requsti. (RestController)
import ee.dianaV.online.entity.Product;
import ee.dianaV.online.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@ - annotatsioonid, mis on vaja importida !!
@RestController
public class ProductController {

    //ühendame Autowiriga meie ProductRepository
    //Autowired teeb uue mälukoha iga kord ehk
    @Autowired
    ProductRepository productRepository;
    //localhost:8088/products
    @GetMapping("products")
    //tagastame hunnik tooteid Listiga
    public List <Product> getProducts() {
        //tagastame front endi, ehk stringi. EI saa tagastade teise andme t[[pi
        return productRepository.findAll(); //SELECT * from automaatne päring extend JpaRepository<Product>
    } //tuleb tühi array []

    @PostMapping("products")//postman rakendus
    public List <Product> addProducts(@RequestBody Product product) {
        //tagasta kõik tooted:
        productRepository.save(product); //INSERT INTO product
        return productRepository.findAll();
    }

    //DELETE LOCALHOST:8080/products/1 or 2 or 6 7
    @DeleteMapping("products/{id}")
    public List <Product> deleteProducts(@PathVariable Long id) {
        productRepository.deleteById(id);
        return productRepository.findAll();
    }
}

