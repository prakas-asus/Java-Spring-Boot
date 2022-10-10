package com.project01.buildDIY.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project01.buildDIY.Models.Basket_Model;

public interface Basket_Repository extends JpaRepository<Basket_Model,Integer>{
    
}
