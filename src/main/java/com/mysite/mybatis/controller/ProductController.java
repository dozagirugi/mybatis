package com.mysite.mybatis.controller;

import com.mysite.mybatis.mapper.ProductMapper;
import com.mysite.mybatis.mapper.UserMapper;
import com.mysite.mybatis.model.Product;
import com.mysite.mybatis.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

// RestController는 화면 없이 바로 객체나 문자열을 제이슨으로 리턴한다
@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable Long id) {
        Product product = productMapper.selectProductById(id);
        return product;
    }

    @GetMapping
    public List<Product> getProducts() {
        List<Product> products = productMapper.selectAllProducts();
        return products;
    }

    @PostMapping
    public void createProduct(@RequestParam("name") String prodName,
                              @RequestParam("price") int prodPrice) {

        productMapper.insertProduct(new Product(prodName, prodPrice));

    }
//
//    @PutMapping("/{id}")
//    public void editUser(@PathVariable String id,
//                         @RequestParam("name") String name,
//                         @RequestParam("phone") String phone,
//                         @RequestParam("address") String address) {
//
//        userMapper.updateUser(id, name, phone, address);
//    }
//
//
//    @DeleteMapping("/{id}")
//    public void deleteUser(@PathVariable String id) {
//        userMapper.deleteUser(id);
//    }
}
