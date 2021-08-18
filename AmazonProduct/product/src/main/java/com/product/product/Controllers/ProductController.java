package com.product.product.Controllers;

import java.util.List;
import java.util.Optional;

import com.product.product.Entities.ProductDetail;
import com.product.product.Services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    
    @Autowired
    ProductService productService;

    
    @PostMapping("/product")
    public ResponseEntity<ProductDetail> addProduct(@RequestBody ProductDetail product){
        try  {
            
            ProductDetail list = productService.addProduct(product);
            return ResponseEntity.of(Optional.of(list));
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
            //TODO: handle exception
        }
    }

    @GetMapping("/product")
    public ResponseEntity<List<ProductDetail>> getProduct(){
        try {
            List<ProductDetail> list = this.productService.getProduct();
            return ResponseEntity.of(Optional.of(list));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/product/{name}")
    public ResponseEntity<List<ProductDetail>> getProductByName(@PathVariable("name") String name){
        try {
            List<ProductDetail> list = this.productService.getProductByName(name);
            return ResponseEntity.of(Optional.of(list));
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @DeleteMapping("/product")
    public ResponseEntity<String> deleteProducts(){
        try {
            this.productService.deleteAllProducts();    
            return ResponseEntity.ok("Deleted");  
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
            //TODO: handle exception
        }

    }
}






