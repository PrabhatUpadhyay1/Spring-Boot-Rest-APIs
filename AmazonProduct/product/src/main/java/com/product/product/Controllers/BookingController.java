package com.product.product.Controllers;

import java.util.List;
import java.util.Optional;

import com.product.product.Entities.Booking;
import com.product.product.Entities.ProductDetail;
import com.product.product.Services.BookingServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {
    
    @Autowired
    BookingServices bookingServices;
    
    @PostMapping("/booking")
    public ResponseEntity<Booking> addBooking(@RequestBody Booking booking){
        try {        
            Booking booking1 = this.bookingServices.addBooking(booking);
            return ResponseEntity.of(Optional.of(booking1));   
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/booking")
    public ResponseEntity<List<Booking>> getBooking(){
        try {        
            List<Booking> list = this.bookingServices.getBooking();
            return ResponseEntity.of(Optional.of(list));   
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/booking/{name}")
    public ResponseEntity<List<ProductDetail>> getBookingByName(@PathVariable("name") String name){
        try {        
            List<ProductDetail> list = this.bookingServices.getBookingByName(name);
            return ResponseEntity.of(Optional.of(list));   
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    @GetMapping("/bookingById/{id}")
    public ResponseEntity<Booking> getBookingById(@PathVariable int id){
        try {
            
            Booking booking = this.bookingServices.getBookingById(id);
            return ResponseEntity.of(Optional.of(booking));
            
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
            //TODO: handle exception
        }
    }

    @DeleteMapping("/booking")
    public boolean deleteAll(){
        try {
            return this.bookingServices.deleteAll();
        } catch (Exception e) {
            return false;
        }
    }

    @DeleteMapping("/booking/{id}")
    public boolean deleteById(int id){
        try {
            return this.bookingServices.deleteByID(id);
        } catch (Exception e) {
            return false;
        }
    }
    
}




