package com.product.product.Deo;

import java.util.List;

import com.product.product.Entities.Booking;
import com.product.product.Entities.ProductDetail;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface BookingReporisoty extends CrudRepository<Booking, Integer> {

    @Query("select product from ProductDetail product where product.product_name =:name")
    public List<ProductDetail> getProductByName(@Param("name") String name);

}
