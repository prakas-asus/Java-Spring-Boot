package com.project01.buildDIY.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "basket")
public class Basket_Model {
    
    private Integer id;
    private Date b_order_date;
    private String b_address_destination;

    public Basket_Model(){

    }
    
    public Basket_Model(Integer id, Date b_order_date, String b_address_destination) {
        this.id = id;
        this.b_order_date = b_order_date;
        this.b_address_destination = b_address_destination;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public Date getB_order_date() {
        return b_order_date;
    }
    public void setB_order_date(Date b_order_date) {
        this.b_order_date = b_order_date;
    }
    public String getB_address_destination() {
        return b_address_destination;
    }
    public void setB_address_destination(String b_address_destination) {
        this.b_address_destination = b_address_destination;
    }

}
