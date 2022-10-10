package com.project01.buildDIY.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project01.buildDIY.Repository.Basket_Repository;
import com.project01.buildDIY.Models.Basket_Model;


@Service
@Transactional
public class Basket_Service {
    
    @Autowired
    private Basket_Repository basketRepo;

    public List<Basket_Model> listAll(){
        return basketRepo.findAll();
    }

    public void save(Basket_Model basketModel){
        basketRepo.save(basketModel);
    }

    public Basket_Model get(Integer id){
        return basketRepo.findById(id).get();
    }

    public void delete(Integer id){
        basketRepo.deleteById(id);
    }
}
