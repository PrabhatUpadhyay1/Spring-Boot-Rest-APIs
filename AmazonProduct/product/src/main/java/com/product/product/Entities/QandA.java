package com.product.product.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;



@Entity
public class QandA {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int qa_id;
    String question;
    String answer;
    String customer_name;
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "qf_id", referencedColumnName = "qa_id")
    @OrderColumn
    OtherAnswer[] other_answer;
    
    
    public QandA() {
    }


    public QandA(int qa_id, String question, String answer, String customer_name, OtherAnswer[] other_answer) {
        this.qa_id = qa_id;
        this.question = question;
        this.answer = answer;
        this.customer_name = customer_name;
        this.other_answer = other_answer;
    }


    public int getQa_id() {
        return qa_id;
    }


    public void setQa_id(int qa_id) {
        this.qa_id = qa_id;
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


    public OtherAnswer[] getOther_answer() {
        return other_answer;
    }


    public void setOther_answer(OtherAnswer[] other_answer) {
        this.other_answer = other_answer;
    }

    
        
}
