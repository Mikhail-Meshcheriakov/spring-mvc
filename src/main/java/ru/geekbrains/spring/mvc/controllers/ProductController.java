package ru.geekbrains.spring.mvc.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring.mvc.model.Product;
import ru.geekbrains.spring.mvc.services.ProductService;

@Controller
@RequestMapping("/products")
public class ProductController {
    ProductService productService;

    @Autowired
    private void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    public String showAllProducts(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return "all_products";
    }

    @PostMapping("/add_product")
    public String addProducts(@ModelAttribute Product product, @RequestParam(required = false) Long id, @RequestParam(required = false) String title, @RequestParam(required = false) Integer coast) {
        System.out.println(id);
        System.out.println(title);
        System.out.println(coast);
        if ((id == null) || (title.equals("")) || (coast == null)) {
            return "redirect:/products/";
        }
        productService.addProduct(product);
        return "redirect:/products/";
    }
}
