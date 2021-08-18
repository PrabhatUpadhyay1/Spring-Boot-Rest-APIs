package com.product.product.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MoreInfo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int mi_id;
    String generic_name;
    String country_of_origin;
    String manufacturer_detail;
    String detail;
    String packer_detail;


    public MoreInfo() {
    }


    public MoreInfo(int mi_id, String generic_name, String country_of_origin, String manufacturer_detail, String detail,
            String packer_detail) {
        this.mi_id = mi_id;
        this.generic_name = generic_name;
        this.country_of_origin = country_of_origin;
        this.manufacturer_detail = manufacturer_detail;
        this.detail = detail;
        this.packer_detail = packer_detail;
    }


    public int getMi_id() {
        return mi_id;
    }


    public void setMi_id(int mi_id) {
        this.mi_id = mi_id;
    }


    public String getGeneric_name() {
        return generic_name;
    }


    public void setGeneric_name(String generic_name) {
        this.generic_name = generic_name;
    }


    public String getCountry_of_origin() {
        return country_of_origin;
    }


    public void setCountry_of_origin(String country_of_origin) {
        this.country_of_origin = country_of_origin;
    }


    public String getManufacturer_detail() {
        return manufacturer_detail;
    }


    public void setManufacturer_detail(String manufacturer_detail) {
        this.manufacturer_detail = manufacturer_detail;
    }


    public String getDetail() {
        return detail;
    }


    public void setDetail(String detail) {
        this.detail = detail;
    }


    public String getPacker_detail() {
        return packer_detail;
    }


    public void setPacker_detail(String packer_detail) {
        this.packer_detail = packer_detail;
    }


}
