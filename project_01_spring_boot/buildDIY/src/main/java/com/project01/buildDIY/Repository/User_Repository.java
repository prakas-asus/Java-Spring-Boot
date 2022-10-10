package com.project01.buildDIY.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project01.buildDIY.Models.User_Model;

public interface User_Repository extends JpaRepository<User_Model,Integer> {
    
}
