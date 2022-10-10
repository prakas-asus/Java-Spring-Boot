package com.project01.buildDIY.Models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "squad")
public class Squad_Model {

    private Integer id;
    private String sqd_name;
    private String sqd_count_member;
    private Date sqd_date_join;
    private Date sqd_date_end;
    private String sqd_system_pay;
    private Integer sqd_salary;
    
    public Squad_Model() {

    }

    public Squad_Model(Integer id, String sqd_name, String sqd_count_member, Date sqd_date_join, Date sqd_date_end,
            String sqd_system_pay, Integer sqd_salary) {
                this.id = id;
                this.sqd_name = sqd_name;
                this.sqd_count_member = sqd_count_member;
                this.sqd_date_join = sqd_date_join;
                this.sqd_date_end = sqd_date_end;
                this.sqd_system_pay = sqd_system_pay;
                this.sqd_salary = sqd_salary;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSqd_name() {
        return sqd_name;
    }

    public void setSqd_name(String sqd_name) {
        this.sqd_name = sqd_name;
    }

    public String getSqd_count_member() {
        return sqd_count_member;
    }

    public void setSqd_count_member(String sqd_count_member) {
        this.sqd_count_member = sqd_count_member;
    }

    public Date getSqd_date_join() {
        return sqd_date_join;
    }

    public void setSqd_date_join(Date sqd_date_join) {
        this.sqd_date_join = sqd_date_join;
    }

    public Date getSqd_date_end() {
        return sqd_date_end;
    }

    public void setSqd_date_end(Date sqd_date_end) {
        this.sqd_date_end = sqd_date_end;
    }

    public String getSqd_system_pay() {
        return sqd_system_pay;
    }

    public void setSqd_system_pay(String sqd_system_pay) {
        this.sqd_system_pay = sqd_system_pay;
    }

    public Integer getSqd_salary() {
        return sqd_salary;
    }

    public void setSqd_salary(Integer sqd_salary) {
        this.sqd_salary = sqd_salary;
    }

}