package com.product.product.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class Hightlights {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int highlight_id;
    String feature_1;
    String feature_2;
    String feature_3;
    String feature_4;

    String[] important_note;
    String warranty;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mf_id", referencedColumnName = "highlight_id")
    List<MoreInfo> more_info;
   
   
    public Hightlights() {
    }


    public Hightlights(int highlight_id, String feature_1, String feature_2, String feature_3, String feature_4,
            String[] important_note, String warranty, List<MoreInfo> more_info) {
        this.highlight_id = highlight_id;
        this.feature_1 = feature_1;
        this.feature_2 = feature_2;
        this.feature_3 = feature_3;
        this.feature_4 = feature_4;
        this.important_note = important_note;
        this.warranty = warranty;
        this.more_info = more_info;
    }


    public int getHighlight_id() {
        return highlight_id;
    }


    public void setHighlight_id(int highlight_id) {
        this.highlight_id = highlight_id;
    }


    public String getFeature_1() {
        return feature_1;
    }


    public void setFeature_1(String feature_1) {
        this.feature_1 = feature_1;
    }


    public String getFeature_2() {
        return feature_2;
    }


    public void setFeature_2(String feature_2) {
        this.feature_2 = feature_2;
    }


    public String getFeature_3() {
        return feature_3;
    }


    public void setFeature_3(String feature_3) {
        this.feature_3 = feature_3;
    }


    public String getFeature_4() {
        return feature_4;
    }


    public void setFeature_4(String feature_4) {
        this.feature_4 = feature_4;
    }


    public String[] getImportant_note() {
        return important_note;
    }


    public void setImportant_note(String[] important_note) {
        this.important_note = important_note;
    }


    public String getWarranty() {
        return warranty;
    }


    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }


    public List<MoreInfo> getMore_info() {
        return more_info;
    }


    public void setMore_info(List<MoreInfo> more_info) {
        this.more_info = more_info;
    }

    
}
