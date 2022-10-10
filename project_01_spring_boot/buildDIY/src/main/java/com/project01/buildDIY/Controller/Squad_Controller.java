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

import com.project01.buildDIY.Service.Squad_Service;

import com.project01.buildDIY.Models.Squad_Model;

@RestController
public class Squad_Controller {

    @Autowired
    private Squad_Service squadSvc;

    @GetMapping("/squad")
    public List<Squad_Model> list() {
        return squadSvc.listAll();
    }

    @GetMapping("/squad/{id}")
    public ResponseEntity<Squad_Model> get(@PathVariable Integer id) {
        try {
            Squad_Model squadModel = squadSvc.get(id);
            return new ResponseEntity<Squad_Model>(squadModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<Squad_Model>(HttpStatus.OK);
        }
    }

    @PostMapping("/squad")
    public void add(@RequestBody Squad_Model squadModel) {
        squadSvc.save(squadModel);
    }

    @PutMapping("/squad/{id}")
    public ResponseEntity<?> update(@RequestBody Squad_Model squadModel, @PathVariable Integer id) {
        try {
            Squad_Model existSquadModel = squadSvc.get(id);
            squadSvc.save(squadModel);
            return new ResponseEntity<>(existSquadModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/squad/{id}")
    public void delete(@PathVariable Integer id) {
        squadSvc.delete(id);
    }
}
