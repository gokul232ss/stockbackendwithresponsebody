package com.example.stockdemo.controller;

import java.util.List;

import com.example.stockdemo.UserDetails;
import com.example.stockdemo.service.StockService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@CrossOrigin("*")
@RequestMapping("/stock")
public class StockController{
    @Autowired
    private StockService stockService;

    @RequestMapping(method=RequestMethod.GET)
    public List<UserDetails> getAllUsers(){
        System.out.println(stockService.getAll());
        return stockService.getAll();
    }
  
    @RequestMapping(value="/{id}",method=RequestMethod.GET)
    public UserDetails find(@PathVariable int id, UriComponentsBuilder ucbuilder ){
        return stockService.find(id);
    }

    @RequestMapping(method=RequestMethod.POST)
    public ResponseEntity<?> save(@RequestBody UserDetails userdetails){
        System.out.println(userdetails);
        try
        {
            return new ResponseEntity<UserDetails>( stockService.save(userdetails),HttpStatus.OK);
        }
        catch(Exception ex)
        {            
            return new ResponseEntity<>( ex.getLocalizedMessage(),HttpStatus.BAD_REQUEST);
        }
    }
 
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void delete(@PathVariable int id){
      stockService.delete(id);
    }

}