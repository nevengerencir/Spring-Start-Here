package main.controllers;

import main.entities.Product;
import main.repos.ProductRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
public class MainController {
  private final ProductRepository productRepository;

    public MainController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/product")
    @Modifying
    public void addProduct(){
        Product product = new Product();
        product.setId(100);
        product.setName("Computer");
        product.setPrice(BigDecimal.valueOf(100));
        product.setExpirationDate(LocalDate.now());
        productRepository.save(product);

    }
}
