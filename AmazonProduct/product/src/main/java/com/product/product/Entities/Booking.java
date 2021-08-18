package com.product.product.Entities;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;


@Entity
public class Booking {
    
    @Id   
    @GeneratedValue(strategy = GenerationType.AUTO)
    int bo_id;

    @OneToOne(cascade = CascadeType.ALL)
    Customer customer;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "bo_fk", referencedColumnName = "bo_id")
    List<ProductDetail> product_List;

    public Booking() {
    }


    public Booking(int bo_id, Customer customer, List<ProductDetail> product_List) {
        this.bo_id = bo_id;
        this.customer = customer;
        this.product_List = product_List;
    }

    public int getBo_id() {
        return bo_id;
    }

    public void setBo_id(int bo_id) {
        this.bo_id = bo_id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<ProductDetail> getProduct_List() {
        return product_List;
    }

    public void setProduct_List(List<ProductDetail> product_List) {
        this.product_List = product_List;
    }

    

}
