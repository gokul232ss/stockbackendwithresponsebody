package com.example.stockdemo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import org.hibernate.annotations.Cascade;

import java.util.List;

import javax.persistence.*;

@Entity
public class Portfolio{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@Column
int id;

@Column
String cat;

@Column
String symbol;

@ManyToOne(cascade=CascadeType.ALL)
@JoinColumn(name="uid",updatable=false,insertable=false)
private UserDetails userdetails;

/**
 * @return the cat
 */
public String getCat() {
    return cat;
}
/**
 * @param cat the cat to set
 */
public void setCat(String cat) {
    this.cat = cat;
}
/**
 * @return the id
 */
public int getId() {
    return id;
}
/**
 * @param id the id to set
 */
public void setId(int id) {
    this.id = id;
}
/**
 * @return the symbol
 */
public String getSymbol() {
    return symbol;
}
/**
 * @param symbol the symbol to set
 */
public void setSymbol(String symbol) {
    this.symbol = symbol;
}
/**
 * @param userdetails the userdetails to set
 */
public void setUserdetails(UserDetails userdetails) {
    this.userdetails = userdetails;
}


@Override
public String toString() {
    return "< "+cat+" , "+symbol+" > ";
}
}