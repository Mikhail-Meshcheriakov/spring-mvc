package ru.geekbrains.spring.mvc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring.mvc.model.Product;
import ru.geekbrains.spring.mvc.repositories.ProductRepositories;

import java.util.List;

@Component
public class ProductService {
    private ProductRepositories productRepositories;

    @Autowired
    private void setProductRepositories(ProductRepositories productRepositories) {
        this.productRepositories = productRepositories;
    }

    public Product getProductById(Long id) {
        return productRepositories.getProductById(id);
    }

    public List<Product> getAllProducts() {
        return productRepositories.getAllProducts();
    }

    public void addProduct(Product product) {
        productRepositories.addProduct(product);
    }
}
