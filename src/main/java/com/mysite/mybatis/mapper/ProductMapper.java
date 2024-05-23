package com.mysite.mybatis.mapper;

import com.mysite.mybatis.model.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {

    // XML을 사용할때는 추상메소드만 만들고 실제 SQL은 지정된 폴더의 XML에 적는다
    Product selectProductById(Long id);
    List<Product> selectAllProducts();
    void insertProduct(Product product);
    void updateProduct(Product product);
    void deleteProductById(Long id);

}
