package com.project01.buildDIY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project01.buildDIY.Repository.User_Repository;
import com.project01.buildDIY.Models.User_Model;

@Service
@Transactional
public class User_Service {

    @Autowired
    private User_Repository userRepo;

    public List<User_Model> listAll(){
        return userRepo.findAll();
    }

    public void save(User_Model userModel){
        userRepo.save(userModel);
    }

    public User_Model get(Integer id){
        return userRepo.findById(id).get();
    }

    public void delete(Integer id){
        userRepo.deleteById(id);
    }
}
