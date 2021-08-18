package com.product.product.Entities;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class ProductDetail {
    

    @Id
    @GeneratedValue
    @Column(name = "id")
    int Id;
    @Column(length = 1000)
    String product_name;
    @Column(length = 1000) 
    String[] photo_url;
    String product_price;
    String product_discount;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "rr_fk", referencedColumnName = "id")
    List<ReviewRating> list;

    @OneToOne(cascade = CascadeType.ALL)
    Hightlights hightlights;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "q_fk", referencedColumnName = "id")
    List<QandA> qList;



    public ProductDetail() {
    }



    public ProductDetail(int id, String product_name, String[] photo_url, String product_price, String product_discount,
            List<ReviewRating> list, Hightlights hightlights, List<QandA> qList) {
        Id = id;
        this.product_name = product_name;
        this.photo_url = photo_url;
        this.product_price = product_price;
        this.product_discount = product_discount;
        this.list = list;
        this.hightlights = hightlights;
        this.qList = qList;
    }



    public int getId() {
        return Id;
    }



    public void setId(int id) {
        Id = id;
    }



    public String getProduct_name() {
        return product_name;
    }



    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }



    public String[] getPhoto_url() {
        return photo_url;
    }



    public void setPhoto_url(String[] photo_url) {
        this.photo_url = photo_url;
    }



    public String getProduct_price() {
        return product_price;
    }



    public void setProduct_price(String product_price) {
        this.product_price = product_price;
    }



    public String getProduct_discount() {
        return product_discount;
    }



    public void setProduct_discount(String product_discount) {
        this.product_discount = product_discount;
    }



    public List<ReviewRating> getList() {
        return list;
    }



    public void setList(List<ReviewRating> list) {
        this.list = list;
    }



    public Hightlights getHightlights() {
        return hightlights;
    }



    public void setHightlights(Hightlights hightlights) {
        this.hightlights = hightlights;
    }



    public List<QandA> getqList() {
        return qList;
    }



    public void setqList(List<QandA> qList) {
        this.qList = qList;
    }
        
}
