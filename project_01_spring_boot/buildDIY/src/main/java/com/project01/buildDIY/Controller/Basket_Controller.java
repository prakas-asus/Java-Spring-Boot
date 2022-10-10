package com.project01.buildDIY.Controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project01.buildDIY.Models.Basket_Model;
import com.project01.buildDIY.Service.Basket_Service;

@RestController
public class Basket_Controller {

    @Autowired
    private Basket_Service basketSvc;

    @GetMapping("/basket")
    public List<Basket_Model> list() {
        return basketSvc.listAll();
    }

    @GetMapping("/basket/{id}")
    public ResponseEntity<Basket_Model> get(@PathVariable Integer id) {
        try {
            Basket_Model basketModel = basketSvc.get(id);
            return new ResponseEntity<Basket_Model>(basketModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Basket_Model>(HttpStatus.OK);
        }
    }

    @PostMapping("/basket")
    public void add(@RequestBody Basket_Model basketModel) {
        basketSvc.save(basketModel);
    }

    @PutMapping("/basket/{id}")
    public ResponseEntity<?> update(@RequestBody Basket_Model basketModel, @PathVariable Integer id) {
        try {
            Basket_Model existBasketModel = basketSvc.get(id);
            basketSvc.save(basketModel);
            return new ResponseEntity<>(existBasketModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/basket/{id}")
    public void delete(@PathVariable Integer id) {
        basketSvc.delete(id);
    }
}
