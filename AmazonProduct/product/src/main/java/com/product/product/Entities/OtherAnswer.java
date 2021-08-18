package com.product.product.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OtherAnswer {

    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int oa_id;
    String question;
    String answer;
    String customer_name;

    public OtherAnswer() {
    }

    public OtherAnswer(int oa_id, String question, String answer, String customer_name) {
        this.oa_id = oa_id;
        this.question = question;
        this.answer = answer;
        this.customer_name = customer_name;
    }

    public int getOa_id() {
        return oa_id;
    }

    public void setOa_id(int oa_id) {
        this.oa_id = oa_id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

        
}
