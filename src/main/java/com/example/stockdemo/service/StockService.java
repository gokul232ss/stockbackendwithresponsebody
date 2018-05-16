package com.example.stockdemo.service;

import java.util.List;

import com.example.stockdemo.UserDetails;

public interface StockService{

    public List<UserDetails> getAll();

    public UserDetails save(UserDetails userdetails);

    public UserDetails find(int id);
    
    public void delete(int id);

}