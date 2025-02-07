package ee.dianaV.online.controller;

//võimaldab Sping Web seda teha, et tekitada API requsti. (RestController)
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

    //localhost:8088/products
    @GetMapping("products")
    public String getProducts() {
        //tagastame front endi, ehk stringi. EI saa tagastade teise andme t[[pi
        return "Hi!";
    }
}

