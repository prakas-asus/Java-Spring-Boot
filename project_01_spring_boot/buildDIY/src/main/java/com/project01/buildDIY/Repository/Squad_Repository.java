package com.project01.buildDIY.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project01.buildDIY.Models.Squad_Model;

public interface Squad_Repository extends JpaRepository<Squad_Model,Integer> {
    
}
