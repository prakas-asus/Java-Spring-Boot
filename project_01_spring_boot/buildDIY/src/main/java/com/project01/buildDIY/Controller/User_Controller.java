package com.project01.buildDIY.Controller;

import com.project01.buildDIY.Service.User_Service;

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

import com.project01.buildDIY.Models.User_Model;

@RestController
public class User_Controller {

    @Autowired
    private User_Service userSvc;

    @GetMapping("/user")
    public List<User_Model> list() {
        return userSvc.listAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User_Model> get(@PathVariable Integer id) {
        try {
            User_Model userModel = userSvc.get(id);
            return new ResponseEntity<User_Model>(userModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User_Model>(HttpStatus.OK);
        }
    }

    @PostMapping("/user")
    public void add(@RequestBody User_Model userModel) {
        userSvc.save(userModel);
    }

    @PutMapping("/user/{id}")
    public ResponseEntity<?> update(@RequestBody User_Model userModel, @PathVariable Integer id) {
        try {
            User_Model existUserModel = userSvc.get(id);
            userSvc.save(userModel);
            return new ResponseEntity<>(existUserModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/user/{id}")
    public void delete(@PathVariable Integer id) {
        userSvc.delete(id);
    }
}
