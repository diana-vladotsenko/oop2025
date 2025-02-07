package ee.dianaV.online.repository;

import ee.dianaV.online.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
