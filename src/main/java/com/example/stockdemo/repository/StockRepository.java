package com.example.stockdemo.repository;

import com.example.stockdemo.UserDetails;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<UserDetails, Integer>{}