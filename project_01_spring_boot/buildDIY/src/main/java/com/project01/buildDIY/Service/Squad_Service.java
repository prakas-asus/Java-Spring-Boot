package com.project01.buildDIY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project01.buildDIY.Repository.Squad_Repository;
import com.project01.buildDIY.Models.Squad_Model;

@Service
@Transactional
public class Squad_Service {

    @Autowired
    private Squad_Repository squadRepo;

    public List<Squad_Model> listAll(){
        return squadRepo.findAll();
    }

    public void save(Squad_Model squadModel){
        squadRepo.save(squadModel);
    }

    public Squad_Model get(Integer id){
        return squadRepo.findById(id).get();
    }

    public void delete(Integer id){
        squadRepo.deleteById(id);
    }
    
}
