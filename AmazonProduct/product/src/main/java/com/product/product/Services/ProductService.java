package com.product.product.Services;

import java.util.List;

import com.product.product.Deo.ProductReporistory;
import com.product.product.Entities.ProductDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class ProductService {
    
    @Autowired
    ProductReporistory productReporistory;

    public ProductDetail addProduct(ProductDetail product){
         ProductDetail productDetails = this.productReporistory.save(product);
        return productDetails;
    }

    public List<ProductDetail> getProduct(){
        List<ProductDetail> productDetails= (List<ProductDetail>) this.productReporistory.findAll();
       return productDetails;
   }

    public String deleteAllProducts(){
       try {
            this.productReporistory.deleteAll();
            return "true";
       } catch (Exception e) {
           return "false";
       }
    }

    public List<ProductDetail> getProductByName(String name){
        try {
             return this.productReporistory.getProductByName(name);
        } catch (Exception e) {
            return null;
        }
     }
     
}








