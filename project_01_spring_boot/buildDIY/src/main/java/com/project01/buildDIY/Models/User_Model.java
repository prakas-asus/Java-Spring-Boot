package com.project01.buildDIY.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User_Model {

    private Integer id;
    private String u_name;
    private String u_email;
    private String u_contact_number;
    private String u_address;
    private String u_male;
    private Date u_date_join;
    private String u_status;

    public User_Model(){

    }

    public User_Model(Integer id, String u_name, String u_email, String u_contact_number, String u_address,
            String u_male, Date u_date_join, String u_status) {
        this.id = id;
        this.u_name = u_name;
        this.u_email = u_email;
        this.u_contact_number = u_contact_number;
        this.u_address = u_address;
        this.u_male = u_male;
        this.u_date_join = u_date_join;
        this.u_status = u_status;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getU_name() {
        return u_name;
    }

    public void setU_name(String u_name) {
        this.u_name = u_name;
    }

    public String getU_email() {
        return u_email;
    }

    public void setU_email(String u_email) {
        this.u_email = u_email;
    }

    public String getU_contact_number() {
        return u_contact_number;
    }

    public void setU_contact_number(String u_contact_number) {
        this.u_contact_number = u_contact_number;
    }

    public String getU_address() {
        return u_address;
    }

    public void setU_address(String u_address) {
        this.u_address = u_address;
    }

    public String getU_male() {
        return u_male;
    }

    public void setU_male(String u_male) {
        this.u_male = u_male;
    }

    public Date getU_date_join() {
        return u_date_join;
    }

    public void setU_date_join(Date u_date_join) {
        this.u_date_join = u_date_join;
    }

    public String getU_status() {
        return u_status;
    }

    public void setU_status(String u_status) {
        this.u_status = u_status;
    }
}
