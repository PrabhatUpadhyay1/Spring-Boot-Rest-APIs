package com.product.product.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


// @Data
// @NoArgsConstructor
// @AllArgsConstructor
@Entity
public class Customer {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int cus_id;
    String name;
    String dob;
    String gender;
    String photo_url;
    String email;
    String mobile;

    public Customer() {
    }
    public Customer(int cus_id, String name, String dob, String gender, String photo_url, String email, String mobile) {
        this.cus_id = cus_id;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.photo_url = photo_url;
        this.email = email;
        this.mobile = mobile;
    }
    public int getCus_id() {
        return cus_id;
    }
    public void setCus_id(int cus_id) {
        this.cus_id = cus_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPhoto_url() {
        return photo_url;
    }
    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    
}
