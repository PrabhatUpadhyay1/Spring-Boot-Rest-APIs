package com.product.product.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OrderColumn;

@Entity
public class ReviewRating {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int rr_id;
    String rating;
    String review;
    String customer_name;
    String location;
    String date_of_buy;
    @OrderColumn
    String[] photo_url;

    public ReviewRating() {
    }

    public ReviewRating(int rr_id, String rating, String review, String customer_name, String location,
            String date_of_buy, String[] photo_url) {
        this.rr_id = rr_id;
        this.rating = rating;
        this.review = review;
        this.customer_name = customer_name;
        this.location = location;
        this.date_of_buy = date_of_buy;
        this.photo_url = photo_url;
    }

    public int getRr_id() {
        return rr_id;
    }

    public void setRr_id(int rr_id) {
        this.rr_id = rr_id;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate_of_buy() {
        return date_of_buy;
    }

    public void setDate_of_buy(String date_of_buy) {
        this.date_of_buy = date_of_buy;
    }

    public String[] getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String[] photo_url) {
        this.photo_url = photo_url;
    }
    
    
}
