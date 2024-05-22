package com.mysite.mybatis.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private Long prodId;
    private String prodName;
    private int prodPrice;

    // id 없는 생성자 => 입력시 사용
    public Product(String prodName, int prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }
}
