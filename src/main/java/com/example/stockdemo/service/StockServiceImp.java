package com.example.stockdemo.service;

import java.util.List;

import com.example.stockdemo.UserDetails;
import com.example.stockdemo.repository.StockRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockServiceImp implements StockService{

    @Autowired
    private StockRepository stockrepository;

	@Override
	public List<UserDetails> getAll() {
		return stockrepository.findAll();
	}

	@Override
	public UserDetails save(UserDetails userdetails) {
		return stockrepository.save(userdetails);
	}

	@Override
	public UserDetails find(int id) {
		return stockrepository.getOne(id);
	}

	@Override
	public void delete(int id) {
		stockrepository.deleteById(id);
	}

}