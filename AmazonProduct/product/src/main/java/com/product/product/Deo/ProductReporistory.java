package com.product.product.Deo;

import java.util.List;

import com.product.product.Entities.ProductDetail;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductReporistory extends CrudRepository<ProductDetail, Integer>{
    
    @Query("select product from ProductDetail product where product.product_name =:name")
    public List<ProductDetail> getProductByName(@Param("name") String name);
    
}
