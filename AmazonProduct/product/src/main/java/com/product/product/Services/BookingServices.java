package com.product.product.Services;

import java.util.List;

import com.product.product.Deo.BookingReporisoty;
import com.product.product.Entities.Booking;
import com.product.product.Entities.ProductDetail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BookingServices {
 
    @Autowired
    BookingReporisoty bookingReporisoty;
    
    public Booking addBooking(Booking booking){
        Booking booking1 = this.bookingReporisoty.save(booking);
        return booking1;
    }

    public List<Booking> getBooking(){
        List<Booking> list =(List<Booking>) this.bookingReporisoty.findAll();
        return list;
    }

    public Booking getBookingById(int id){
        Booking booking = this.bookingReporisoty.findById(id).get();
        return booking;
    }

    public List<ProductDetail> getBookingByName(String name){
        List<ProductDetail> bookingList = this.bookingReporisoty.getProductByName(name);
        return bookingList;
    }

    public boolean deleteAll(){
        try {
            this.bookingReporisoty.deleteAll();
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public boolean deleteByID(int id){
        try {
            this.bookingReporisoty.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
